package com.example.teste.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.teste.model.Disciplina;
import com.example.teste.model.exception.ResourceNotFoundException;
import org.springframework.stereotype.Repository;


@Repository
public class DisciplinaRepository {

    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
    private Integer ultimoId = 0;

/***
 * Metodo para Retornar uma lista de disciplinas
 * @return Lista de Disciplinas
 */
    public List<Disciplina>obterTodos(){
        return disciplinas;

    }


/**
 * Metodo que retorna a disciplina encontra pelo seu id
 * @param id da disciplina que sera localizada
 * @return a disciplina que tenha sido encontrada
 */    
    
    public Optional<Disciplina>obterPorId(Integer id){
        return disciplinas
        .stream()
        .filter(disciplina -> disciplina.getId()== id)
        .findFirst();

    }
/**
 * Metodo para adicionar uma disciplina na lista
 * @param disciplina que sera adicionada
 * @return retorna a disciplina que foi adicionada na lista
 */
    public Disciplina adicionar(Disciplina disciplina){
        ultimoId++;
        disciplina.setId(ultimoId);
        disciplinas.add(disciplina);

        return disciplina;
    }

    /**
     * Metodo para deletar a disciplina por ID
     * @param id da disciplina a ser deletada
     */
    public void deletar(Integer id){
        disciplinas.removeIf(disciplina -> disciplina.getId() == id);
    }

    /**
     * Metodo para atualizar a discipina na lista
     * @param disciplina que sera atualizada
     * @return retorna a disciplina apos atualizar a lista
     */
    public Disciplina atualizar(Disciplina disciplina){

        Optional <Disciplina> disciplinaEncontrada = obterPorId(disciplina.getId());

        if(disciplinaEncontrada.isEmpty()){
        throw new ResourceNotFoundException("Disciplina nao encontrada");
    }
   
        deletar(disciplina.getId());

        adicionar(disciplina);  

        return disciplina;
    }



}

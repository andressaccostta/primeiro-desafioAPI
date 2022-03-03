package com.example.teste.service;

import java.util.List;
import java.util.Optional;

import com.example.teste.model.Disciplina;
import com.example.teste.repository.DisciplinaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisciplinaService { 
@Autowired
private DisciplinaRepository disciplinaRepository;

/** Metodo para retornar uma lista de disciplinas
 * 
 * @return Lista de disciplinas
 */


public List<Disciplina> obterTodos() {
    return disciplinaRepository.obterTodos();
}

/**
 * Metodo para retornar a disciplina encontrada pelo seu id
 * @param id a disciplina que sera localizada
 * @return retorna uma disciplina caso tenha sido encontrada
 */

public Optional<Disciplina> obterporId(Integer id){
    return disciplinaRepository.obterPorId(id);
}

/**
 * Metodo para adicionar a disciplina na lista
 * @param disciplina que sera adicionada
 * @return retorna a disciplina que foi adicionada
 */

public Disciplina adicionar(Disciplina disciplina){
    return disciplinaRepository.adicionar(disciplina);
}

/**
 * Metodo para deletar a disciplina por id
 * @param id da disciplina a ser deletada
 */

public void deletar(Integer id){
    disciplinaRepository.deletar(id);
}

/**
 * Metodo para atualizar a disciplina na lista
 * @param disciplina que sera atualizada
 * @return a disciplina apos atualizar na lista
 */
public Disciplina atualizar(Integer id, Disciplina disciplina){
    disciplina.setId(id);
    return disciplinaRepository.atualizar(disciplina);
    }

}

package com.example.teste.service;
import java.util.List;
import java.util.Optional;

import com.example.teste.model.Aluno;
import com.example.teste.repository.AlunoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
    
    @Service
    public class AlunoService{
        
    @Autowired
    private  AlunoRepository alunoRepository;

    
    public List<Aluno> obterTodos() {
        return alunoRepository.obterTodos();
    }
    
    public Optional<Aluno> obterPorId(Integer id){
        return alunoRepository.obterPorId(id);
    }
    
    public Aluno adicionar(Aluno aluno){
        return alunoRepository.adicionar(aluno);
    }
    
    public void deletar(Integer id){
        alunoRepository.deletar(id);
    }
    
    public Aluno atualizar(Integer id, Aluno aluno){
        aluno.setId(id);
    
        return alunoRepository.atualizar(aluno);
    }
    
}
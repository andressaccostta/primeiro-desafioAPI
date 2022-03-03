package com.example.teste.controller;
import java.util.List;
import java.util.Optional;

import com.example.teste.model.Aluno;
import com.example.teste.service.AlunoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/alunos")

public class AlunoController {

@Autowired
private AlunoService alunoService;

@GetMapping
    public List<Aluno> obterTodos(){
        return alunoService.obterTodos();
    }

    @GetMapping("/{id}")
    public Optional<Aluno> obterPorId(@PathVariable Integer id){
        return alunoService.obterPorId(id);
    }

    @PostMapping
    public Aluno adicionar(@RequestBody Aluno aluno){
        return alunoService.adicionar(aluno);
    }


    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Integer id){
        alunoService.deletar(id);
        return  "Produto com id:" + id + "Foi deletado com sucesso";

        
    }


    @PutMapping
    public Aluno atualizar(@RequestBody Aluno aluno, @PathVariable Integer id){
        return alunoService.atualizar(id, aluno);  
    }
}

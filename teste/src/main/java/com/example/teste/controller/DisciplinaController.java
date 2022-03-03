package com.example.teste.controller;

import java.util.List;
import java.util.Optional;

import com.example.teste.model.Disciplina;
import com.example.teste.service.DisciplinaService;

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
@RequestMapping("/api/disciplinas")

public class DisciplinaController {
    
@Autowired
private DisciplinaService disciplinaService;



@GetMapping

    public List<Disciplina> obterTodos(){
        return disciplinaService.obterTodos();
    }


@GetMapping("/{id}")
public Optional<Disciplina> obterPorId(@PathVariable Integer id){
    return disciplinaService.obterporId(id);
}


@PostMapping
public Disciplina adicionar(@RequestBody Disciplina disciplina){
    return disciplinaService.adicionar(disciplina);
}


@DeleteMapping("/{id}")
public String deletar(@PathVariable Integer id){
    disciplinaService.deletar(id);
    return "Disciplina com id" + id + "Deletado com Sucesso";
}


@PutMapping
public Disciplina atualizar(@RequestBody Disciplina disciplina, @PathVariable Integer id){
    return disciplinaService.atualizar(id, disciplina);
}

}

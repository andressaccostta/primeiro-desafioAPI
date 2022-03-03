package com.example.teste.model;

public class Disciplina {
    
 //#region
    private String Nomedisciplina;
    private String  Nomeprofessor;
    private String observacao;
    private Integer id; 
    private Integer duracaoMinutos;
//#endRegion


 ////#region GET E SETTERS   
    public String getNomedisciplina() {
        return Nomedisciplina;
    }
    public void setNomedisciplina(String nomedisciplina) {
        Nomedisciplina = nomedisciplina;
    }
    public String getNomeprofessor() {
        return Nomeprofessor;
    }
    public void setNomeprofessor(String nomeprofessor) {
        Nomeprofessor = nomeprofessor;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getDuracaoMinutos() {
        return duracaoMinutos;
    }
    public void setDuracaoMinutos(Integer duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
//#endregion













}

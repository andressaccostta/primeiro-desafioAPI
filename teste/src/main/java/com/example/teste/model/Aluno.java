package com.example.teste.model;

public class Aluno {
    ///#region
    
    private String nome;
    private String email;
    private Integer idade;
    private Integer id;
 ////#endregion

  
///#region get e setters
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
///#endregion


}

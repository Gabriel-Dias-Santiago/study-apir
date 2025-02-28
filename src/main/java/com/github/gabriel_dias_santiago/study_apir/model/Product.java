package com.github.gabriel_dias_santiago.study_apir.model;

public class Product {
    private String nome;
    private Long id;


    public Product(String nome, Long id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public Long getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    

}

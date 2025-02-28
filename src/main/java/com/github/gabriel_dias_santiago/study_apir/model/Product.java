package com.github.gabriel_dias_santiago.study_apir.model;

public class Product {
    private String nome;
    private int id;

    public void Product(String nome, int id){
        nome = this.nome;
        id = this.id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    

}

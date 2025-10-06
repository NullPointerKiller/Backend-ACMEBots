package com.example.Model;

public class Cliente {
    private final String nome;
    private final String email;

    public Cliente(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

}

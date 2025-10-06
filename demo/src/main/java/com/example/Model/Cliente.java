package com.example.Model;

import java.util.UUID;

public class Cliente {
    private final String nome;
    private final String email;
    private final String codigo;

    public Cliente(String nome, String email){
        this.nome = nome;
        this.email = email;
        this.codigo = UUID.randomUUID().toString();
    }

    public String getCodigo(){
        return this.codigo;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

}

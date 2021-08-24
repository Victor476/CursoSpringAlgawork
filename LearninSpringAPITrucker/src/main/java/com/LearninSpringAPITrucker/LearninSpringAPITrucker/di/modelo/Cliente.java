/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LearninSpringAPITrucker.LearninSpringAPITrucker.di.modelo;

/**
 *
 * @author victor
 */
public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private boolean ativo = false;

public Cliente (String nome, String email, String telefone){
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
}
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean isAtivo() {
        return ativo;
    }
    
    public void ativar(){
        this.ativo = true;
    }
}


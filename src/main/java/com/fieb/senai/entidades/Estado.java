/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieb.senai.entidades;

/**
 *
 * @author Aluno
 */
public class Estado {
    private String nome;
    
    private Cidade Cidade;

    public Estado(String nome, Cidade Cidade) {
        this.nome = nome;
        this.Cidade = Cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return Cidade;
    }

    public void setCidade(Cidade Cidade) {
        this.Cidade = Cidade;
    }
    
    
}

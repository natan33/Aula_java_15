/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieb.senai.entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import net.bytebuddy.asm.Advice;

/**
 *
 * @author Aluno
 */
public class Cliente {
    private String nome; 
    private Integer matricula;
    private Integer idade;
    
    private Endereco Endereco;
    Set<String> Telefone = new HashSet<>();
     
    public Cliente(String nome, Integer matricula, Integer idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }
     public Cliente()
    
    {
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(Endereco Endereco) {
        this.Endereco = Endereco;
    }

    public Set<String> getTelefone() {
        return Telefone;
    }
    public void setTelefone(String... telefones) {
       this.Telefone.addAll(Arrays.asList(telefones));
            
    }
      


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.nome);
        hash = 83 * hash + Objects.hashCode(this.matricula);
        hash = 83 * hash + Objects.hashCode(this.idade);
        hash = 83 * hash + Objects.hashCode(this.Endereco);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.idade, other.idade)) {
            return false;
        }
        if (!Objects.equals(this.Endereco, other.Endereco)) {
            return false;
        }
        return true;
    }
    
    
}

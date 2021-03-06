/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetolivraria.LivrariaFox.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 *
 * @author usuario
 */
@Entity
public class Funcionario implements Serializable {
     private static final long serialVersionUID = 1L;
    
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;
       @NotNull
   private String cargo;
       @NotNull
   private String nome;
         @NotNull
   private String rg;
          @NotNull
   private String cpf;
           @NotNull
   private String usuario;
            @NotNull
   private String senha;
            @NotNull
   private String email;
              @NotNull
   private int telefone;


    public String getCargo() {
        return cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
   
    
}


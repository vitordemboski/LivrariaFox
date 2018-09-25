/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetolivraria.LivrariaFox.models;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author usuario
 */

@Entity
public class Livro {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
  
    @NotNull
    private String titulo;

    @NotNull
    private String genero;

    @NotNull
    private String autor;

    @NotNull
    private double preco;
    @NotNull
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date datapub;
    @NotNull
    private int idadeind;

    @NotNull 
    private String colecao;
   
    @Lob
    @Basic(fetch=FetchType.LAZY)
    private byte[] capa;

    public Livro() {
        
    }

    public Livro(long id, String titulo, String genero, String autor, double preco, Date datapub, int idadeind, String colecao, byte[] capa) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.preco = preco;
        this.datapub = datapub;
        this.idadeind = idadeind;
        this.colecao = colecao;
        this.capa = capa;
    }
    
    

    public byte[] getCapa() {
        return capa;
    }

    public void setCapa(byte[] capa) {
        this.capa = capa;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Date getDatapub() {
        return datapub;
    }

    public void setDatapub(Date datapub) {
        this.datapub = datapub;
    }

    public int getIdadeind() {
        return idadeind;
    }

    public void setIdadeind(int idadeind) {
        this.idadeind = idadeind;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

   
    public String getColecao() {
        return colecao;
    }

    public void setColecao(String colecao) {
        this.colecao = colecao;
    }
    
    
            
}


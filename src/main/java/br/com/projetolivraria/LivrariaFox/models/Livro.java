/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetolivraria.LivrariaFox.models;

import java.io.Serializable;
import java.util.Date;
import javassist.bytecode.ByteArray;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 *
 * @author usuario
 */

@Entity
public class Livro implements Serializable {
     private static final long serialVersionUID = 1L;
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
  
    @NotEmpty
    private String titulo;

    @NotEmpty
    private String genero;

    @NotEmpty
    private String autor;

    @NotEmpty
    private float preco;
    @NotEmpty
    private Date datapub;
    @NotEmpty
    private int idadeind;

    @NotEmpty 
    private String colecao;
    @NotEmpty
    @Lob
    private byte[] capa;

    public Livro() {
    }

    public Livro(long id, String titulo, String genero, String autor, float preco, Date datapub, int idadeind, String colecao, byte[] capa) {
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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
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


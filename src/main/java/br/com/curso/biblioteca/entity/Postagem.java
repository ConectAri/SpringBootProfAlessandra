package br.com.curso.biblioteca.entity;

import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Postagem extends ObraDigital{

    private Enum plataforma;
    private String conteudo;

    public Postagem(){

    }

    public Postagem (long id, String titulo, Date dataPublicacao, String url, Enum plataforma, String conteudo){
        super(id, titulo, dataPublicacao, url);
        this.plataforma = plataforma;
        this.conteudo = conteudo;
    }

    public Enum getPlataforma(){
        return plataforma;
    }

    public String getConteudo(){
        return conteudo;
    }

}

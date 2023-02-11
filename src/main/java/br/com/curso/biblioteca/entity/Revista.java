package br.com.curso.biblioteca.entity;

import jakarta.persistence.Entity;

import java.util.Date;


@Entity
public class Revista extends ObraFisica{

    private Integer numero;

    public Revista(){
    }

    public Revista(Long id, String titulo, Date dataPublicacao, String codLocalizacao, Integer numero){
        super(id,titulo,dataPublicacao, codLocalizacao);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

}

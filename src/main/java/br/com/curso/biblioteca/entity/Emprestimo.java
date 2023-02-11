package br.com.curso.biblioteca.entity;


import jakarta.persistence.Entity;

import java.util.Date;


@Entity
public class Emprestimo {

    private Long id;
    private Date date;

    public Emprestimo(){

    }


}

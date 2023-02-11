package br.com.curso.biblioteca.entity;

import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class ObraFisica extends Obra {

    protected String codLocalizacao;

    public ObraFisica() {

    }

    public ObraFisica(Long id, String titulo, Date dataPublicacao, String codLocalizacao) {
        super(id, titulo, dataPublicacao);
        this.codLocalizacao = codLocalizacao;
    }

        public String getCodLocalizacao () {
            return codLocalizacao;
        }
    }




package br.com.curso.biblioteca.entity;

import java.util.Date;

public class ObraDigital extends Obra {

    protected String url;

    public ObraDigital(){

    }

    public ObraDigital(long id, String titulo, Date dataPublicacao, String url){
        super(id, titulo, dataPublicacao);
        this.url = url;
    }

    public String getUrl(){
        return url;
    }

}

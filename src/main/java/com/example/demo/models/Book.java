package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public class Book {
    private String titulo;
    private List<Autor> autores;
    private List<String> idiomas;
    private Integer numeroDescargas;

    @Override
    public String toString() {
        return
                "titulo='" + titulo + '\'' +
                ", autores=" + autores +
                ", idiomas=" + idiomas +
                ", numeroDescargas=" + numeroDescargas
                ;
    }

    public Book(DatosBook datosBook) {
        this.titulo = datosBook.titulo();
        this.idiomas = datosBook.idiomas();
        this.numeroDescargas = datosBook.descargas();
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }

    public Integer getNumeroDescargas() {
        return numeroDescargas;
    }

    public void setNumeroDescargas(Integer numeroDescargas) {
        this.numeroDescargas = numeroDescargas;
    }
}

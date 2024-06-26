package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String titulo;
    @Enumerated(EnumType.STRING)
    private Idiomas idioma;
    private Integer numeroDescargas;
    @OneToMany(mappedBy = "book",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Autor> autores;

    public Book() {

    }

    @Override
    public String toString() {
        return
                "\n*********LIBRO********************\n" +
                        "titulo:'" + titulo + '\'' +"\n"+
                " autores:" + autores +"\n"+
                " idiomas:" + idioma +"\n"+
                " numeroDescargas:" + numeroDescargas+"\n"+
                        "*****************************\n"
                ;
    }

    public Book(DatosBook datosBook) {
        this.titulo = datosBook.titulo();
        this.idioma = Idiomas.fromString(datosBook.idiomas().get(0));
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
        autores.forEach(a->a.setBook(this));
        this.autores = autores;
    }

    public Integer getNumeroDescargas() {
        return numeroDescargas;
    }

    public void setNumeroDescargas(Integer numeroDescargas) {
        this.numeroDescargas = numeroDescargas;
    }
}

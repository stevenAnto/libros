package com.example.demo.models;

import jakarta.persistence.*;
import org.hibernate.grammars.hql.HqlParser;

@Entity
@Table(name = "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private  String name;
    private Integer birhtDay;
    private Integer deathDay;
    @ManyToOne
    private Book book;

    public Autor(DatosAutor autor) {
        this.name = autor.name();
        this.birhtDay = autor.birthYear();
        this.deathDay = autor.deathYear();
    }

    public Autor() {

    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return
                "\n***************Autor***************\n"+
                " name='" + name + '\'' +"\n"+
                " birhtDay=" + birhtDay +"\n"+
                " deathDay=" + deathDay +"\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBirhtDay() {
        return birhtDay;
    }

    public void setBirhtDay(Integer birhtDay) {
        this.birhtDay = birhtDay;
    }

    public Integer getDeathDay() {
        return deathDay;
    }

    public void setDeathDay(Integer deathDay) {
        this.deathDay = deathDay;
    }
}

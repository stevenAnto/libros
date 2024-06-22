package com.example.demo.reposotory;

import com.example.demo.models.Autor;
import com.example.demo.models.Book;
import com.example.demo.models.Idiomas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {
    List<Book> findByIdioma(Idiomas idioma);
    @Query("SELECT a FROM Book b JOIN b.autores a")
    List<Autor> getTotalAutores();

    @Query("SELECT a FROM Book b JOIN b.autores a WHERE :anio>=a.birhtDay AND :anio<=a.deathDay")
    List<Autor> autoresVivvos(Integer anio);
}

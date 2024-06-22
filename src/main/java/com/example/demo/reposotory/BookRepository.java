package com.example.demo.reposotory;

import com.example.demo.models.Autor;
import com.example.demo.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {
    @Query("SELECT a FROM Book b JOIN b.autores a")
    List<Autor> getTotalAutores();
}

package com.example.demo.Principal;

import com.example.demo.models.*;
import com.example.demo.reposotory.BookRepository;
import com.example.demo.services.ConsumoAPI;
import com.example.demo.services.ConvierteDatos;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private final String URL_BASE = "http://gutendex.com/books/?search=";
    private ConvierteDatos conversor = new ConvierteDatos();
    private BookRepository repository;

    public Principal(BookRepository repository) {
        this.repository = repository;
    }

    public void mostrarMenu() {
        var opcion = -1;
        while (opcion!=0){
            var menu = """
                    1- Buscar libro por titulo
                    2- Listar todos los libros consultados
                    3- Listar autores registrados
                    4- Listar autores en un determinado anio
                    5- Listr libros por idioma
                    0- Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    buscarPorTitulo();
                    break;
                case 2:
                    listarLibros();
                    break;
                case 3:
                    listarAutores();
                    break;
                case 4:
                    autoreDeterminadosanio();
                    break;
                case 5:
                    buscarLibroPorIdioma();
                    break;
                case 0:
                    System.out.println("Cerrando aplicacion");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }


    private DatosConsulta getDatosConsulta(){
        System.out.println("Escriba el nombre del titulo que desea buscar");
        var nombreTitulo = teclado.nextLine();
        String urlBuscada= URL_BASE+nombreTitulo.replace(" ","%20");
        System.out.println("Su consulta es "+urlBuscada);
        var json = consumoApi.obtenerDatos(urlBuscada);
        System.out.println("Resultado de la busqueda "+json);
        DatosConsulta datosConsulta = conversor.obtenerDatos(json,DatosConsulta.class);
        return  datosConsulta;

    }

    private void buscarPorTitulo() {
        DatosConsulta datosConsulta = getDatosConsulta();
        if(datosConsulta.count()==0){
            System.out.println("\nLo siento, no se encontro ninguan coincidencia\n");
            System.out.println("*******************");
        }
        else {
            System.out.println("Encontrados "+ datosConsulta);
            DatosBook bookBuscado = datosConsulta.datosBook().get(0);
            List<DatosAutor> autoresDatos= bookBuscado.autores();
            List<Autor> autores = autoresDatos.stream()
                    .map(a->new Autor(a))
                    .collect(Collectors.toList());
            Book book = new Book(bookBuscado);
            book.setAutores(autores);
            System.out.println("El pripmero es");
            System.out.println(book);
            repository.save(book);
        }
    }

    private void listarLibros() {
        List<Book> books = repository.findAll();
        books.forEach(System.out::println);
    }
    private void buscarLibroPorIdioma() {
        String opcionesIdioomas= """
                es - español
                en - inglés
                """;
        System.out.println("Escriba el idioma");
        System.out.println(opcionesIdioomas);
        var inputIdioma = teclado.nextLine();
        Idiomas idioma;
        try{
            idioma  = Idiomas.fromString(inputIdioma);
            List<Book> booksPorIdioma = repository.findByIdioma(idioma);
            System.out.println("Las series encontradas son");
            booksPorIdioma.forEach(System.out::println);
        }catch (IllegalArgumentException e){
            System.out.println("input invalido");
        }
    }

    private void autoreDeterminadosanio() {
        System.out.println("Ingrese el anio el cual desea buscar");
        var anioBuscado = teclado.nextLine();
        try {
            Integer anioValido = Integer.parseInt(anioBuscado);
            buscarAutorePorAnio(anioValido);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor ingrese un número entero.");
        }
    }
    private void buscarAutorePorAnio(Integer anio){
        List<Autor> autores = repository.autoresVivvos(anio);
        System.out.println("Estos se encontraron");
        autores.forEach(System.out::println);
    }

    private void listarAutores() {
        List<Autor> autores= repository.getTotalAutores();
        autores.forEach(System.out::println);
    }
}

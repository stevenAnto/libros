package com.example.demo.Principal;

import com.example.demo.models.Book;
import com.example.demo.models.DatosBook;
import com.example.demo.models.DatosConsulta;
import services.ConsumoAPI;
import services.ConvierteDatos;

import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private final String URL_BASE = "http://gutendex.com/books/?search=";
    private ConvierteDatos conversor = new ConvierteDatos();

    public void mostrarMenu() {
        var opcion = -1;
        while (opcion!=0){
            var menu = """
                    1- Buscar libro por titulo
                    2- Listar todos los libros consultados
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
                case 0:
                    System.out.println("Cerrando aplicacion");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }

    private DatosConsulta getDatosConsulta(){
        System.out.println("Escriba el nombre del titulo que desea buscar");
        var nombreTitulo = teclado.nextLine();
        String urlBuscada= URL_BASE+nombreTitulo.replace(" ","%20");
        System.out.println("sy consutlaa e "+urlBuscada);
        var json = consumoApi.obtenerDatos(urlBuscada);
        System.out.println("Resultado de la busqueda "+json);
        DatosConsulta datosConsulta = conversor.obtenerDatos(json,DatosConsulta.class);
        return  datosConsulta;

    }
    private void listarLibros() {
    }

    private void buscarPorTitulo() {
        DatosConsulta datosConsulta = getDatosConsulta();
        System.out.println("Todos "+ datosConsulta);
        DatosBook bookBuscado = datosConsulta.datosBook().get(0);
        Book book = new Book(bookBuscado);
        System.out.println("el pripmero es");
        System.out.println(book);
    }
}

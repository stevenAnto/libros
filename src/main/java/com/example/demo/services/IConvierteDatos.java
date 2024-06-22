package com.example.demo.services;

public interface IConvierteDatos  {
    <T> T obtenerDatos(String json, Class<T> clase);
}

package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosConsulta(
        @JsonAlias("count")
        Integer count,
        @JsonAlias("results")
        List<DatosBook> datosBook
) {
}

package com.example.demo.models;

public enum Idiomas {
    ES("es"),
    EN("en");
    private String idioma;

    Idiomas(String idioma) {
        this.idioma = idioma;
    }

    public static Idiomas fromString(String txt){
        for(Idiomas i : Idiomas.values()){
            if(i.idioma.equalsIgnoreCase(txt)){
                return  i;
            }
        }
        throw  new IllegalArgumentException("No hay idioma para "+txt);
    }
}

package com.example.demo.models;

public class Autor {
    private  String name;
    private Integer birhtDay;
    private Integer deathDay;

    public Autor() {
        this.name = name;
        this.birhtDay = birhtDay;
        this.deathDay = deathDay;
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

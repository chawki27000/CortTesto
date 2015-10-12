package com.example.ilyes.myapplication.backend.model;

/**
 * Created by ilyes on 12/10/15.
 */
public class Personne {

    private String name;
    private int age;


    public Personne(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

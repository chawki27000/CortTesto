package com.example.ilyes.myapplication.backend.model;

/**
 * Created by ilyes on 12/10/15.
 */
public class Student extends Personne {

    private String univ;
    private String department;
    private String annee;


    public Student(String name, int age, String univ, String department, String annee) {
        super(name, age);
        this.univ = univ;
        this.department = department;
        this.annee = annee;
    }


    public String getUniv() {
        return univ;
    }

    public void setUniv(String univ) {
        this.univ = univ;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }
}

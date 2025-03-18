package com.example.devoir4.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "employees" , schema = "public")
public class Employee {
    @Id
    @Column(name = "id", nullable = false)
    private Short id;

    @Size(max = 255)
    @Column(name = "nom")
    private String nom;

    @Size(max = 255)
    @Column(name = "age")
    private String age;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
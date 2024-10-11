package com.example.simpleproject.Models;

public class Developer {
     private String name;

     private String assignment;

     private String id;

    public String getName() {
        return name;
    }

    public String getAssignment() {
        return assignment;
    }

    public String getId() {
        return id;
    }

    public Developer(String name, String assignment, String id) {
        this.name = name;
        this.assignment = assignment;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Developer() {
    }
}

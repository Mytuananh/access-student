package com.codegym;

public class student {
    private String name ="John";
    private String classes = "C02";

    public student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public void display() {
        System.out.println(name + " " + classes);
    }
}

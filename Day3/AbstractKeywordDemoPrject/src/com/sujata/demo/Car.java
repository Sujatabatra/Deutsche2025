package com.sujata.demo;
/*
abstract can be a class or a method
1. we can't instantiate(create object of abstract class)
2. if a class have even one abstract method then its mandatory to mark class also as abstract
3. abstract methods are like contract with the child classes,
that child class have to give the definition of abstract methods.
 */
abstract public class Car {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
    //contract being fulfiled by child class, means definition will be given by  child class
    abstract public void engine();
}

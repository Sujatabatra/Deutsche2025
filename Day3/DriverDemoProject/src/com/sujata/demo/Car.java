package com.sujata.demo;

public class Car {
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
    public void engine(){
        System.out.println("Kindly fit your own engine!");
    }
}

package com.sujata.demo;

public class BMW extends Car{

    public BMW(String model, String color) {
        super(model, color);
    }

    @Override
    public void engine() {
        bmwEngine();
    }

    public void bmwEngine(){

        System.out.println("BMW Engine goes BOOOOOOMMMM!!");
    }


}

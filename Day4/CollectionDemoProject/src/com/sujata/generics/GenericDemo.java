package com.sujata.generics;

class InputInteger{
    private Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}

class InputString{
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
class InputPerson{
    private Person value;

    public Person getValue() {
        return value;
    }

    public void setValue(Person value) {
        this.value = value;
    }
}

class GenericInput<T>{
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
//Generic Classes/Interfaces/Methods are independent of any of Java Object Type;
public class GenericDemo{

    public static void main(String[] args) {
        GenericInput<Double> doubleInput=new GenericInput<>();
        doubleInput.setValue(4.5);
        System.out.println(doubleInput.getValue());

        GenericInput<Boolean> booleanGenericInput=new GenericInput<>();
        booleanGenericInput.setValue(true);
        System.out.println(booleanGenericInput.getValue());

        GenericInput<Person> personInput=new GenericInput<>();
        personInput.setValue(new Person(1,"AAA",89));
        System.out.println(personInput.getValue().getpName());
    }
}

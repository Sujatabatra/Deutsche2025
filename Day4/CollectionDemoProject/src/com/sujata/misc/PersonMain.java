package com.sujata.misc;

public class PersonMain {
    public static void main(String[] args) {
        int i=10;
        int j=10;
        if(i==j){
            System.out.println("i and j are equal");
        }
        else{
            System.out.println("i and j are not equal");
        }
        Person person1=new Person(1,"AAA",56);
        Person person2=new Person(1,"AAA",56);

        if(person1==person2)
            System.out.println("person 1 and person 2 are equal");
        else
            System.out.println("person 1 and person 2 are not equal");

        if(person1.equals(person2))
            System.out.println("person 1 and person 2 are equal");
        else
            System.out.println("person 1 and person 2 are not equal");

        System.out.println("person 1 hashcode "+person1);
        System.out.println("person 2 hashcode "+person2);

    }

}

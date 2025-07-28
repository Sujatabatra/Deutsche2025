package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PersonTreeSetDemoClass {

    public static void main(String[] args) {
        /*
        HashSet is the Unordered Unique Collection of Objects,
        and that collection is auto growable and auto shrinkable
         */
//        Set<Person> dataCollectoion=new TreeSet<>();

        Set<Person> dataCollectoion=new TreeSet<>(new SortByName());
        System.out.println(dataCollectoion.size());
        System.out.println(dataCollectoion);

        dataCollectoion.add(new Person(1,"AAA",89));
        dataCollectoion.add(new Person(2,"ZZZ",90));
        dataCollectoion.add(new Person(3,"CCC",45));
        dataCollectoion.add(new Person(4,"GGG",73));
        dataCollectoion.add(new Person(5,"EEE",67));

        System.out.println(dataCollectoion.size());
        System.out.println(dataCollectoion);

        dataCollectoion.remove(new Person(1,"AAA",89));
        System.out.println(dataCollectoion.size());
        System.out.println(dataCollectoion);

        System.out.println("Traversal Using For each");
        for(Person element:dataCollectoion){
            System.out.println(element);
        }

        System.out.println("Traversal Using Iterator");
        Iterator<Person> personIterator=dataCollectoion.iterator();
        while(personIterator.hasNext()){
            System.out.println(personIterator.next());
        }
    }

}

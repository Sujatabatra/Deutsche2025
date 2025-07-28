package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemoClass {

    public static void main(String[] args) {
        /*
        HashSet is the Unordered Unique Collection of Objects,
        and that collection is auto growable and auto shrinkable
         */
        HashSet<Integer> dataCollectoion=new HashSet<>();

        System.out.println(dataCollectoion.size());
        System.out.println(dataCollectoion);

        dataCollectoion.add(10);
        dataCollectoion.add(100);
        dataCollectoion.add(15);
        dataCollectoion.add(67);
        dataCollectoion.add(15);

        System.out.println(dataCollectoion.size());
        System.out.println(dataCollectoion);

        dataCollectoion.remove(67);
        System.out.println(dataCollectoion.size());
        System.out.println(dataCollectoion);

        System.out.println("Traversal Using For each");
        for(Integer element:dataCollectoion){
            System.out.println(element);
        }

        System.out.println("Traversal Using Iterator");
        Iterator<Integer> integerIterator=dataCollectoion.iterator();
        while(integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }

}

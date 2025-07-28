package com.sujata.setdemos;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemoClass {

    public static void main(String[] args) {
        /*
        TreeSet is the Sorted Unique Collection of Objects,
        and that collection is auto growable and auto shrinkable
         */
        Set<Integer> dataCollectoion=new TreeSet<>();

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
        /*Iterator :interface
        Interface referenceVariable=new ImplementationClass();
        Iterator refVariable=FactoryMethod();
         */
        Iterator<Integer> integerIterator=dataCollectoion.iterator();
        while(integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }

}

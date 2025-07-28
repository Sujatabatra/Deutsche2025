package com.sujata.com.sujata.listdemos;

import java.util.*;

public class LinkedListDemoClass {
    /*
    LinkedList is indexed ordered auto growable and auto shrinkable
    duplicated collection of objects
     */
    public static void main(String[] args) {

        List<Integer> dataCollection=new LinkedList<>();

        System.out.println("Size of Collection : "+dataCollection.size());
        System.out.println(dataCollection);

        dataCollection.add(10);
        dataCollection.add(15);
        dataCollection.add(100);
        dataCollection.add(10);
        dataCollection.add(45);

        System.out.println("Size of Collection : "+dataCollection.size());
        System.out.println(dataCollection);

        dataCollection.remove(2);

        System.out.println("Size of Collection : "+dataCollection.size());
        System.out.println(dataCollection);

        System.out.println("Traversal Using Traditional for loop");
        for(int index=0;index<dataCollection.size();index++){
            System.out.println(dataCollection.get(index));
        }

        System.out.println("Traversal using for each loop");
        for(Integer element:dataCollection){
            System.out.println(element);

        }

        System.out.println("Traversal using Iterator");
        Iterator<Integer> integerIterator=dataCollection.iterator();
        while(integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }

        ListIterator<Integer> listIterator=dataCollection.listIterator();

        System.out.println("Backward Traversal using ListIterator");
        while(listIterator.hasNext()){
            listIterator.next();
        }

        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}

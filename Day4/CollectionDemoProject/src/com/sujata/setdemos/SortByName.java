package com.sujata.setdemos;

import java.util.Comparator;

public class SortByName implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getpName().compareTo(person2.getpName());
    }
}

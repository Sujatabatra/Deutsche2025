package com.sujata.setdemos;

import java.util.Comparator;

public class SortById implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        if(person1.equals(person2))
            return 0;
        if(person1.getpId()>person2.getpId())
            return 1;
        else
            return -1;

            }
}

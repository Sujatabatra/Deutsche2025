package com.sujata.mapdemos;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemoClass {
    /*
    HashMap is Key Value Pair of Collection of Objects,
    where Keys are Unique and Values can be Duplicated,
    Collection is auto growable and auto shrinkable
    Collection is Sorted, sorting wrt keys.

     */
    public static void main(String[] args) {
        Map<String,Integer> months=new TreeMap<>();

        System.out.println(months.size());
        System.out.println(months);

        months.put("Jan",31);
        months.put("Feb",28);
        months.put("Mar",31);
        months.put("Apr",30);

        System.out.println(months.size());
        System.out.println(months);

        months.put("Feb",29);
        months.put("May",31);

        System.out.println(months.size());
        System.out.println(months);

        months.remove("Apr");
        System.out.println(months.size());
        System.out.println(months);

        Set<String> monthNames=months.keySet();
        for(String monthName:monthNames){
            System.out.println(monthName+" has "+months.get(monthName)+" days");
        }

    }
}

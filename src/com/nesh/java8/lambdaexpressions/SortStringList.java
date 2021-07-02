package com.nesh.java8.lambdaexpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStringList {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Dennis", "Brian", "Charlie", "Alice");
        Collections.sort(names, new Comparator<>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

        System.out.println("names = " + names);

        List<String> safari = Arrays.asList("Dennis", "Brian", "Charlie", "Alice");
//        Collections.sort(safari, (String a, String b)->{
//            return a.compareTo(b);
//        });

        Collections.sort(safari,(a,b)-> a.compareTo(b));

//        Collections.sort(safari, String::compareTo);

//        safari.sort(String::compareTo);

        System.out.println("safari = " + safari);

    }
}

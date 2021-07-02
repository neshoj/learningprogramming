package com.nesh.java8.functioninterfaces;

/**
 * Functional interface must contain exactly one abstract method
 */
public class FunctionalInterfaces {

    public static void main(String[] args) {
//        Converter<String, Integer> converter = from -> Integer.valueOf(from);
        Converter<String, Integer> converter = Integer::valueOf;
        Integer converted = converter.convert("123");
        System.out.println("converted = " + converted);

    }
}

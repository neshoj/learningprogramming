package com.nesh.java8.functioninterfaces;

@FunctionalInterface
public interface Converter<F,T> {
    T convert(F from);
}

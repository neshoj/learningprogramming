package com.nesh.java8.defaultmethodsforinterfaces;

/**
 * Java 8 enables the addition of the non-abstract methods
 * utilizing the default keyword. Extension methods is the name
 * of the feature
 */
public interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}

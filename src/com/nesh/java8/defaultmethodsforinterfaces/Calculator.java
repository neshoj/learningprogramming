package com.nesh.java8.defaultmethodsforinterfaces;

public class Calculator{

    public static void main(String[] args) {

        /**
         * Anonymous class: enable you to make your code more concise.
         * They enable you to declare and instantiate a class at the same time.
         * They are like local classes except that they do not have a name.
         * Use them if you need to use a local class only once.
         */
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a);
            }
        };

        double calculate = formula.calculate(100);
        System.out.println("calculate(100) = " + calculate);
        double sqrt = formula.sqrt(16);
        System.out.println("sqrt(16) = " + sqrt);

    }
}

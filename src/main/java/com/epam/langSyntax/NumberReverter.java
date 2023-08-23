package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {

        int revertNumber = (100 * (number % 10)) + (10 * ((number/10) % 10)) + number/100;

        System.out.println(revertNumber);
    }

}

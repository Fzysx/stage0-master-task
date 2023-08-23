package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum = 0;

        sum = number % 10 + (number / 10) % 10 + (number / 100) % 10 + (number / 1000) % 10;

        System.out.println(sum);
    }
}

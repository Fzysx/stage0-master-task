package com.epam.conditions;

import jdk.swing.interop.SwingInterOpUtils;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {

        int result = 0;

        if (divider == 0){
            System.out.println("division by zero");
        } else {
            result = dividend / divider;
        }

        if(result * divider == dividend && divider != 0) {
            System.out.println("can be divided completely");
        } else if (result * divider != dividend && divider != 0) {
            System.out.println("cannot be divided completely");
        }


    }

}

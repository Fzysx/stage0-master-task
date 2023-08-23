package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {

            for (int j = cathetusLength; j >= 1; j--) {

                if (i >= j) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }

            for (int k = 2; k <= cathetusLength; k++) {
                    if (i >= k) {
                        System.out.print(k);
                    }
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        new Pyramid().printPyramid(9);
    }

}

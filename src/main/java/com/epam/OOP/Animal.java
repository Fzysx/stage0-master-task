package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){

        String hasFur = "no";

        if(this.hasFur){
            hasFur = "a";
        } else {
            hasFur = "no";
        }

        if (numberOfPaws == 1) {
            return "This animal is mostly " + this.color + ". It has " + this.numberOfPaws + " paw and " + hasFur + " fur.";
        } else {
            return "This animal is mostly " + this.color + ". It has " + this.numberOfPaws + " paws and " + hasFur + " fur.";
        }
    }

}

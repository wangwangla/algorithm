package com.shejimoshi.chapterThree;

public class Espresso extends Beverage{
    public Espresso(){
        desrcription = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}

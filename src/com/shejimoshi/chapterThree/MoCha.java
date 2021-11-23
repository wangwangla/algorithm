package com.shejimoshi.chapterThree;

public class MoCha extends CondimentDecorator{
    private Beverage beverage;
    public MoCha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDesrcription() {
        return beverage.getDesrcription()+"MM";
    }

    @Override
    public double cost() {
        return super.cost()+20;
    }
}

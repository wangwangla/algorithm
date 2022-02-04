package kw.shejimoshi.chapterThree;

public abstract class Beverage {
    String desrcription = "Unknown Beverage";
    public String getDesrcription(){
        return desrcription;
    }
    public abstract double cost();
}

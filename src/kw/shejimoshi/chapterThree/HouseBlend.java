package kw.shejimoshi.chapterThree;

public class HouseBlend extends Beverage{
    public HouseBlend(){
        desrcription = "House Blend";
    }
    @Override
    public double cost() {
        return 0.9;
    }
}

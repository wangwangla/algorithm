package kw.shejimoshi.chapterThree;

public abstract class CondimentDecorator extends Beverage{
    public abstract String getDesrcription() ;

    @Override
    public double cost() {
        return 0;
    }
}

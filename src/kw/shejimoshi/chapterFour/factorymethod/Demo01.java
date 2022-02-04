package kw.shejimoshi.chapterFour.factorymethod;

import kw.shejimoshi.chapterFour.simplefactory.BaseFactory;
import kw.shejimoshi.chapterFour.simplefactory.People;

public class Demo01 extends Demo{
    @Override
    public BaseFactory Fcreate() {
        return new People();
    }
}

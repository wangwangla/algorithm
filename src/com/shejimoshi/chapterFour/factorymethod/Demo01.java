package com.shejimoshi.chapterFour.factorymethod;

import com.shejimoshi.chapterFour.simplefactory.BaseFactory;
import com.shejimoshi.chapterFour.simplefactory.People;

public class Demo01 extends Demo{
    @Override
    public BaseFactory Fcreate() {
        return new People();
    }
}

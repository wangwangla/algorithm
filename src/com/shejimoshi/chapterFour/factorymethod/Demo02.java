package com.shejimoshi.chapterFour.factorymethod;

import com.shejimoshi.chapterFour.simplefactory.BaseFactory;
import com.shejimoshi.chapterFour.simplefactory.Student;

public class Demo02 extends Demo {
    @Override
    public BaseFactory Fcreate() {
        return new Student();
    }
}

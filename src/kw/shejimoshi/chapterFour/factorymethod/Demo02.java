package kw.shejimoshi.chapterFour.factorymethod;

import kw.shejimoshi.chapterFour.simplefactory.BaseFactory;
import kw.shejimoshi.chapterFour.simplefactory.Student;

public class Demo02 extends Demo {
    @Override
    public BaseFactory Fcreate() {
        return new Student();
    }
}

package com.shejimoshi.chapterFour.factory;

public class Factory {
    public BaseFactory getInstance(int type){
        if (type == 1){
            return new People();
        }else {
            return new Student();
        }
    }
}

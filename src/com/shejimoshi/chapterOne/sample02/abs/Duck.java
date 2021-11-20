package com.shejimoshi.chapterOne.sample02.abs;

import com.shejimoshi.chapterOne.sample02.interfa.Behave;
import com.shejimoshi.chapterOne.sample02.interfa.Fly;

public class Duck {
    protected Behave behave;
    protected Fly fly;
    public void beHave(){
        if (behave!=null){
            behave.behave();
        }
    }

    public void fly(){
        if (fly == null)return;
        fly.fly();
    }
}

package kw.shejimoshi.chapterOne.sample02;

import kw.shejimoshi.chapterOne.sample02.impl.ClickBehave;
import kw.shejimoshi.chapterOne.sample02.interfa.Behave;

public class App {
    public static void main(String[] args) {
        App app = new App();
        //面向多态编程
        Behave behave = app.getBehave();
        behave.behave();
    }

    public Behave getBehave(){
        return new ClickBehave();
    }
}

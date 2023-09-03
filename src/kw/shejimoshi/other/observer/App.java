package kw.shejimoshi.other.observer;

import kw.shejimoshi.chapterTwo.ShowTempl;
import kw.shejimoshi.chapterTwo.TimeTempl;
import kw.shejimoshi.chapterTwo.Weather;

public class App {
    public static void main(String[] args) {
        Weather weather = new Weather();
        ShowTempl templ = new ShowTempl();
        weather.res(templ);
        TimeTempl timeTempl = new TimeTempl();
        weather.res(timeTempl);
        weather.update();
    }
}

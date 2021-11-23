package kw.other.observer;

import com.shejimoshi.chapterTwo.ShowTempl;
import com.shejimoshi.chapterTwo.TimeTempl;
import com.shejimoshi.chapterTwo.Weather;

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

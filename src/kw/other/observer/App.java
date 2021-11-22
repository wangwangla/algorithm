package kw.other.observer;

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

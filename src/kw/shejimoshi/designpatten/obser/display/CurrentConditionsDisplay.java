package kw.shejimoshi.designpatten.obser.display;

import kw.shejimoshi.designpatten.obser.oberver.Oberver;
import kw.shejimoshi.designpatten.obser.subject.Weather;

public class CurrentConditionsDisplay implements Oberver,DisplayElement {

    public CurrentConditionsDisplay(Weather weather){
        weather.resi(this);
    }

    @Override
    public void display() {
        System.out.println("-----------");
    }

    @Override
    public void updata(int num1, int num2, int num) {
        display();
    }
}

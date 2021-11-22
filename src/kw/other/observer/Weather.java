package kw.other.observer;

import java.util.ArrayList;

public class Weather implements Subject{
    private ArrayList<Obsever> arrayList = new ArrayList<>();
    @Override
    public void res(Obsever obsever) {
        arrayList.add(obsever);
    }

    @Override
    public void remove(Obsever obsever) {
        arrayList.remove(obsever);
    }

    @Override
    public void notifySe() {
        for (Obsever obsever : arrayList) {
            obsever.show();
        }
    }

    public void update(){
        notifySe();
    }
}

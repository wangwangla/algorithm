package com.learn.src.iterator.example;

import com.learn.src.iterator.example.aggregate.Aggregate;
import com.learn.src.iterator.example.iterator.Iterator;
import com.learn.src.iterator.example.iterator.PeopleIterator;

import java.util.ArrayList;
import java.util.List;

public class World implements Aggregate {
    private List<People> array;

    public World(){
        this.array = new ArrayList<>();
    }

    public People getPeopleAt(int index){
        return this.array.get(index);
    }

    public void appendPeople(People people){
        this.array.add(people);
    }

    public int getLength(){
        return this.array.size();
    }

    public Iterator getIterator(){
        return new PeopleIterator(this);
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}

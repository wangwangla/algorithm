package kw.learn.src.iterator.example.iterator;

import kw.learn.src.iterator.example.People;
import kw.learn.src.iterator.example.World;

/**
 * 好处就是无论存储如何的发生变化，遍历部分都不需要变化
 */
public class PeopleIterator implements Iterator{
    private World world ;
    private int index = 0;
    public PeopleIterator(World world) {
        this.world = world;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < world.getLength()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        People people = world.getPeopleAt(index);
        index ++;
        return people;
    }
}

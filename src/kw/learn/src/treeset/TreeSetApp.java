package kw.learn.src.treeset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetApp {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(0);
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        HashSet

    }
}

package com.algorithm._10_sort.compare;

import java.util.Comparator;

public class CompartorDemo implements Comparator<Student> {

    @Override
    public int compare(Student o1,Student o2) {
        //类型转化

        return o1.getAge() - o2.getAge();
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    public static void main(String[] args) {
        Student st1 = new Student("ka",1);
        Student st2 = new Student("ka",6);
        CompartorDemo demo = new CompartorDemo();
        System.out.println(demo.compare(st1, st2));
    }
}

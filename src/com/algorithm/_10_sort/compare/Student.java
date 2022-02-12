package com.algorithm._10_sort.compare;

/**
 * 我们需要进行比较的时候，就需要给他们提供一个比较规则，这个比较规则就需要实现接口
 */
public class Student implements Comparable<Student>{
    private String username;
    private int age;

    public Student(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String
    toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }


    public static void main(String[] args) {
        Student stu1 = new Student("kangwang",1);
        Student stu2 = new Student("kangwang",5);
        int i = stu2.compareTo(stu1);
        System.out.println(i);
    }
}

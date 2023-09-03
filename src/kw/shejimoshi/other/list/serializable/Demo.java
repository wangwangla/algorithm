package kw.shejimoshi.other.list.serializable;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws Exception{
        People people = new People();
        people.setAge(210);
        people.setName("khhhhw");
        ObjectOutputStream inputStream = new ObjectOutputStream(new FileOutputStream(new File("1.txt")));
        inputStream.writeObject(people);
        inputStream.flush();
        inputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("1.txt"));
        People people1 = (People) objectInputStream.readObject();
        System.out.println(people1.getAge()+"--"+people1.getName());
    }
}

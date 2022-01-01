package kw.other.list.clone;

public class QianClone {
    public static void main(String[] args) {
        try {
            Animal animal = new Animal();
            animal.setName("k");
            animal.setType("mao");
            Animal clone = animal.clone();
            clone.setName("zai");
            System.out.println(clone.getName()+" --- "+animal.getName());
//            System.out.println(clone.getName()+" --- "+clone.getType());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

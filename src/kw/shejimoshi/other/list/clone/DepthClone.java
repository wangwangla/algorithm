package kw.shejimoshi.other.list.clone;

public class DepthClone {
    public static void main(String[] args) {
        try {
            Dog dog = new Dog();
            Type type = new Type();
            type.setType(2);
            dog.setName("wngwng");
            dog.setType(type);
            System.out.println(dog.getType()+"-----------"+dog.getType().getType());
            Dog clone = (Dog) dog.clone();
            Type type1 = clone.getType();
            type1.setType(4);

            System.out.println(dog.getType()+"-----------"+dog.getType().getType());
            System.out.println(clone.getType()+"--------------"+clone.getType().getType());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

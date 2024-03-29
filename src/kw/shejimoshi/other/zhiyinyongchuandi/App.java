package kw.shejimoshi.other.zhiyinyongchuandi;

/**
 * 值传递  和   引用传递
 */
public class App {
    public static void main(String[] args) {
        App demo02 = new App();
        People kang = new People("kang", 12);
        demo02.ceshi(kang);
        System.out.printf(""+kang);

        int i = 3;
        demo02.ceshi1(i);
        System.out.printf("i   "+ i);
    }
    public void ceshi(People people){
        people.setAge(29);
    }
    public void ceshi1(int i){
        i = 0;
    }

}
class People{
    private String name;
    private int age;

    People(String name,int age){
        this.name = name;
        this.age =  age;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


package kw.other.single.bean;

public class People {
    private static People people;
    public static People getInstance(){
        if (people == null){
            people = new People();
        }
        return people;
    }
}

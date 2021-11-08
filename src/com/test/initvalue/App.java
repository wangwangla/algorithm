package com.test.initvalue;

/**
 * 参数初始化的值
 */
public class App {
    private Info info;
    public App(){
        info = new Info();
    }
    public void printInfo(){
        info.getInfo();
    }

    public static void main(String[] args) {
        App demo03 = new App();
        demo03.printInfo();
    }
}

class Info{
    private String name;  //初始值null
    private int age; //初始值0
    private String address;  //初始值null
    public void getInfo() {
        System.out.printf("name:"+name+"age:"+age+"address："+address);
    }

}

package com.algorithm.digui;

public class AddDiGui {

    private int num;

    public static void main(String[] args) {
        AddDiGui gui = new AddDiGui();
        gui.add(3);
        System.out.println(gui.num);
    }

    public void add(int n){
        if (n == 0) {
            num = 0;
            return;
        }
        add(n-1);
        num=num+n;
    }
}

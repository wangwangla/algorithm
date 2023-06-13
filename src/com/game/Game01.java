package com.game;

import com.beust.ah.A;

import java.util.ArrayList;

public class Game01 {
    public static void main(String[] args) {
        int index = 1;
        int dd = 1;
        int table = 3;
        ArrayList<Bean> arrayList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int i1 = 0; i1 < table; i1++) {
                System.out.print(" ");
            }
            for (int i1 = 0; i1 < index; i1++) {
                Bean bean = new Bean();
                bean.index = dd;
                bean.line = table+i1*2;
                bean.row = i;
                arrayList.add(bean);
                System.out.print(dd+++" ");
            }
            table --;
            index++;
            System.out.println("");
        }

        for (Bean bean : arrayList) {
            System.out.println(bean);
        }
    }

    static class Bean{
        public Bean(){}
        public int index;
        public int cardIndex;
        public int line;
        public int row;

        @Override
        public String toString() {
            return "Bean{" +
                    "index=" + index +
                    ", cardIndex=" + cardIndex +
                    ", line=" + line +
                    ", row=" + row +
                    '}';
        }
    }
}

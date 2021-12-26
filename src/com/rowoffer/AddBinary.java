package com.rowoffer;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 内存
 */
public class AddBinary {
    public static void main(String[] args) {
        AddBinary binary = new AddBinary();
//        "101111"
//        "10"
        binary.addBinary("101111","10");
    }

    public String addBinary(String a, String b) {
        String[] aSplit = a.split("");
        String[] bSplit = b.split("");
        Deque<Integer> deque1 = new LinkedList<>();
        Deque<Integer> deque2 = new LinkedList<>();
        Deque<Integer> deque3 = new LinkedList<>();

        for (String aChar : aSplit) {
            deque1.push(Integer.valueOf(aChar));
        }
        for (String aChar : bSplit) {
            deque2.push(Integer.valueOf(aChar));
        }
        int xx = 0;
        while (!deque1.isEmpty() && !deque2.isEmpty()) {
            int pop = deque1.pop();
            int pop1 = deque2.pop();
            int xxx = pop + pop1 + xx;
            if (xxx == 2){
                xxx = 0;
                xx = 1;
            }else if (xxx == 3){
                xxx = 1;
                xx = 1;
            }else{
                xx = 0;
            }
            deque3.push(xxx);
        }
        while (!deque1.isEmpty()){
            int i = deque1.pop() + xx;
            if (i == 2){
                xx = 1;
                i = 0;
            }else if (i == 3){
                i = 1;
                xx = 1;
            }else {
                xx = 0;
            }
            deque3.push(i);
        }

        while (!deque2.isEmpty()){
            int i = deque2.pop() + xx;
            if (i == 2){
                xx = 1;
                i = 0;
            }else if (i == 3){
                i = 1;
                xx = 1;
            }else {
                xx = 0;
            }
            deque3.push(i);
        }
        if (xx == 1){
            deque3.push(1);
        }
        StringBuilder builder = new StringBuilder();
        while (!deque3.isEmpty()) {
            builder.append(deque3.pop());
        }
        return builder.toString();
    }

    public String addBinary1(String a, String b) {
        String[] aSplit = a.split("");
        String[] bSplit = b.split("");
        StringBuilder builder = new StringBuilder();
        int index = 0;
        int xx = 0;
        while (index<aSplit.length && index<bSplit.length){
            String s1 = aSplit[aSplit.length - index - 1];
            String s2 = bSplit[bSplit.length - index - 1];
            int ss1 = Integer.valueOf(s1);
            int ss2 = Integer.valueOf(s2);
            int ss3 = ss1 + ss2 + xx;

            if (ss3 == 2){
                ss3 = 0;
                xx = 1;
            }else if (ss3 == 3){
                ss3 = 1;
                xx = 1;
            }else{
                xx = 0;
            }
            builder.insert(0,ss3);
            index ++;
        }

        while (index < aSplit.length){
            int i = Integer.valueOf(aSplit[aSplit.length - 1 - index]) + xx;
            if (i == 2){
                xx = 1;
                i = 0;
            }else if (i == 3){
                i = 1;
                xx = 1;
            }else {
                xx = 0;
            }

            builder.insert(0,i);
        }

        while (bSplit.length>index){
            int i = Integer.valueOf(bSplit[bSplit.length - 1 - index]) + xx;

            if (i == 2){
                xx = 1;
                i = 0;
            }else if (i == 3){
                i = 1;
                xx = 1;
            }else {
                xx = 0;
            }

            builder.insert(0,i);
        }
        if (xx == 1){

            builder.insert(0,1);
        }
        return builder.toString();
    }
    public String addBinary2(String a, String b) {
        String[] aSplit = a.split("");
        String[] bSplit = b.split("");
        StringBuilder builder = new StringBuilder();
        int index = 0;
        int xx = 0;
        while (index<aSplit.length && index<bSplit.length){
            String s1 = aSplit[aSplit.length - index - 1];
            String s2 = bSplit[bSplit.length - index - 1];
            int ss1 = Integer.valueOf(s1);
            int ss2 = Integer.valueOf(s2);
            int ss3 = ss1 + ss2 + xx;

            if (ss3 == 2){
                ss3 = 0;
                xx = 1;
            }else if (ss3 == 3){
                ss3 = 1;
                xx = 1;
            }else{
                xx = 0;
            }
            builder.insert(0,ss3);
            index ++;
        }

        while (index < aSplit.length){
            int i = Integer.valueOf(aSplit[aSplit.length - 1 - index]) + xx;
            index ++;
            if (i == 2){
                xx = 1;
                i = 0;
            }else if (i == 3){
                i = 1;
                xx = 1;
            }else {
                xx = 0;
            }

            builder.insert(0,i);
        }

        while (bSplit.length>index){
            int i = Integer.valueOf(bSplit[bSplit.length - 1 - index]) + xx;
            index ++;
            if (i == 2){
                xx = 1;
                i = 0;
            }else if (i == 3){
                i = 1;
                xx = 1;
            }else {
                xx = 0;
            }

            builder.insert(0,i);
        }
        if (xx == 1){

            builder.insert(0,1);
        }
        return builder.toString();
    }


    public String addBinary3(String a, String b) {
        String[] aSplit = a.split("");
        String[] bSplit = b.split("");
        StringBuilder builder = new StringBuilder();
        int index = 0;
        int xx = 0;
        while (index<aSplit.length || index<bSplit.length){
            int ss1 = 0;
            int ss2 = 0;
            if (index<aSplit.length) {
                String s1 = aSplit[aSplit.length - index - 1];
                ss1 = Integer.valueOf(s1);
            }
            if (index<bSplit.length) {
                String s2 = bSplit[bSplit.length - index - 1];
                ss2 = Integer.valueOf(s2);
            }
            int ss3 = ss1 + ss2 + xx;

            if (ss3 == 2){
                ss3 = 0;
                xx = 1;
            }else if (ss3 == 3){
                ss3 = 1;
                xx = 1;
            }else{
                xx = 0;
            }
            builder.insert(0,ss3);
            index ++;
        }
        if (xx == 1){

            builder.insert(0,1);
        }
        return builder.toString();
    }
}

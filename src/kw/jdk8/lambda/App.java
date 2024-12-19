package kw.jdk8.lambda;

import kw.jdk8.lambda.MathUtils;

public class App {
    public static void main(String[] args) {
        MathUtils mathUtils = (int a,int b)->{
            return a + b;
        };

        MathUtils mx = (a,b)->{
            return a + b;
        };

/*
        MathUtils xx = a,b->{
            return a + b;
        }
*/
        MathUtils xx = (a,b)->a+b;


        //
        add((int a, int b)->{
            return a + b;
        });
    }

    public static void add(MathUtils mathUtils){
        mathUtils.add(2,4);
    }
}

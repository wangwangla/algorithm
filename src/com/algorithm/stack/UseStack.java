package com.algorithm.stack;

import com.algorithm.sort.util.SortUtils;

import java.nio.charset.StandardCharsets;

public class UseStack {
    public static void main(String[] args) {
        String expression = "7" +
                "*2*2-5+1-5+3-4";
        Stack<Integer> numStack = new Stack<>(10);
        Stack<Integer> operStack = new Stack<>(10);

        int index = 0; //用于扫描
        int num1 = 0;
        int num2 = 0;
        int oper = 0;
        int res = 0;
        char ch = ' ';
        String keepNum = "";
        while (true){
            //如果是一个
            ch = expression.substring(index ,index+1).charAt(0);
            if (operStack.isOper(ch)){
                if (!operStack.isEmpty()){
                    if (operStack.privrity(ch)<=operStack.privrity(operStack.peek())){
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        oper = operStack.pop();
                        res = numStack.cal(num1,num2,oper);
                        numStack.push(res);
                        operStack.push((int)ch);
                    }else {
                        operStack.push((int)ch);
                    }
                }else {
                    keepNum+=ch;
                    if (index == expression.length() - 1){
                        numStack.push(Integer.parseInt(keepNum));
                    }else {
                        if (operStack.isOper(expression.substring(index+1,index+2).charAt(0))){
                            numStack.push(Integer.parseInt(keepNum));
                            keepNum = "";
                        }
                    }
                }
            }

            index++;
            if (index > expression.length()){
                break;
            }
        }
        while (true){
            if (operStack.isEmpty()){
                break;
            }
            num1 = numStack.pop();
            num2 = numStack.pop();
            oper = operStack.pop();
            res = numStack.cal(num1,num2,oper);
            numStack.push(res);
        }
        int res2 = numStack.pop();
        System.out.println(res2);
    }

    static class Stack<T>{
        private T[] stack;
        private int maxSize;
        private int top;

        public Stack(int maxSize){
            this.maxSize = maxSize;
            stack = (T[])new Object[maxSize];
        }

        public T peek(){
            if (isEmpty())return null;
            return stack[top];
        }

        private boolean isEmpty() {
            return top<0;
        }

        private void push(T data){
            if (isFull())return;
            stack[++top] = data;
        }

        private T pop(){
            if (isEmpty())return null;
            return stack[top--];
        }

        private boolean isFull(){
            return top+1 >= maxSize;
        }

        private void list(){
            for (int i = 0; i < top; i++) {
                System.out.println(stack[top - i]);
            }
        }

        private int privrity(int oper){
            if (oper == '*' || oper == '/'){
                return 1;
            }else if (oper == '+' || oper == '-'){
                return 0;
            }else {
                return -1;
            }
        }

        public boolean isOper(char val){
            return val == '+' || val == '-' || val == '*' || val == '/';
        }

        public int cal(int num1,int num2,int oper){
            int res = 0;
            switch (oper){
                case '+':
                    res = num1 + num2;
                    break;
                case '-':
                    res = num2 - num1;
                    break;
                case '*':
                    res = num1 * num2;
                    break;
                case '/':
                    res = num2 / num1;
                    break;
                default:
                    break;
            }
            return res;
        }





















    }
}

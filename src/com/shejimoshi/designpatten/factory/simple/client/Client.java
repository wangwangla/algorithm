package com.shejimoshi.designpatten.factory.simple.client;

import com.shejimoshi.designpatten.factory.simple.order.PazziaOrder;

/**
 * 简单 工厂：可以使用if else if 将需要的对象名称传进去 然后进行创建相应的对象
 */
public class Client {
    public static void main(String[] args) {
        new PazziaOrder();
    }
}

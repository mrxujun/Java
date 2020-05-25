package com.xj.factorymethod;

import com.xj.simplefactory.SimpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {
    //定义一个抽象方法，让各个子类实现
    abstract Pizza createPizza(String orderType);
    //构造器
    public OrderPizza(){
        Pizza pizza = null;
        String orderType;
        do{
            orderType = gettype();
            pizza = createPizza(orderType);
            //输出pizza的制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    //获取客户希望定取得pizza
    private String gettype(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type");
            String str = strin.readLine();
            return  str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}

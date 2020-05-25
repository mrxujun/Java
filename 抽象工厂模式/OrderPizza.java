package com.xj.absfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    AbsFactory factory;
    //构造器
    public  OrderPizza(AbsFactory factory){
        setAbsFactory(factory);
    }
    public void setAbsFactory(AbsFactory factory){
        Pizza pizza = null;
        String orderType = "";
        this.factory = factory;
        do{
            orderType = gettype();
            pizza = factory.createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
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

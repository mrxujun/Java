package com.xj.simplefactory;
//简单工厂类
public class SimpleFactory {
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }
        else if(orderType.equals("cheese")) {
            pizza = new CheesePizz();
            pizza.setName("奶酪披萨");

        }
        return pizza;
    }
}

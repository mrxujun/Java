package com.xj.factorymethod;

public class LDOrderPizza extends OrderPizza {


    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }
        else if(orderType.equals("pepper")){
            pizza = new BJpepperPizza();
        }
        return pizza;
    }
}

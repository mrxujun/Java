package com.xj.factorymethod;

import com.xj.simplefactory.OrderPizza;
import com.xj.simplefactory.SimpleFactory;
//客户在点不同口味的pizza时，扩展性就不好，
//解决方案：将披萨项目的实例化功能抽象成抽象方法，在不同的子类中具体实现
//工厂方法模式:定义一个创建对象的抽象方法，由子类决定实例化的对象。
public class PizzSrore {
    //使用工厂方法模式
    public static void main(String[] args) {
        String loc = "bj";
        if(loc.equals("bj")){
            new BJOrderPizza();
        }
        else {
            new LDOrderPizza();
        }


    }
}

package com.xj.absfactory;
//一个抽象工厂模式的抽象层（接口）
public interface AbsFactory {
    //让下面的工厂子类来实现
    public Pizza createPizza(String orderType);
}

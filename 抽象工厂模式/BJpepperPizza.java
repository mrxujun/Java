package com.xj.absfactory;

public class BJpepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("北京的胡椒pizza准备原材料");
    }
}

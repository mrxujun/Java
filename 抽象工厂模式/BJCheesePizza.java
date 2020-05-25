package com.xj.absfactory;

public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("北京的奶酪pizza准备原材料");
    }
}

package com.xj.factorymethod;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("伦敦的奶酪pizza准备原材料");
    }
}

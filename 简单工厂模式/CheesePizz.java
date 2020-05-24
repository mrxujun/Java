package com.xj.simplefactory;

public class CheesePizz extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备奶酪pizz的原材料");
    }
}

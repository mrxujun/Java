package com.xj.absfactory;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("伦敦的胡椒pizza准备原材料");
    }
}

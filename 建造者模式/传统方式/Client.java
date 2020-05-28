package com.xj.build.传统方式;
//好理解，简单易操作,但是产品和和产品建造过程耦合性太强
public class Client  {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}

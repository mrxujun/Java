package com.xj.simplefactory;
//简单工厂
//特点：把创建实例化类的封装起来
public abstract class Pizza {
    protected  String  name;
    //不同的pizz用的原材料不一样
    public abstract  void  prepare();
    public void bake(){
        System.out.println(name+"braking");
    }

    public void cut(){
        System.out.println(name+"cuting");
    }

    public void box(){
        System.out.println(name+"boxing");
    }

    public void setName(String name){
        this.name = name;
    }
}

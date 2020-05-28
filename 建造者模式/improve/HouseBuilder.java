package com.xj.build.improve;
//抽象的建造者
public  abstract class HouseBuilder {
    protected  House house = new House();
    //建造的流程
    //打地基
    public abstract void buildBasic();
    //砌墙
    public abstract void  buildWalss();
    //封顶
    public abstract void rootfed();

    public House buildHouse(){
        return  house;
    }
}

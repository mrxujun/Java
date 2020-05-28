package com.xj.build.传统方式;

public abstract class AbstractHouse  {
    //打地基
    public abstract void buildBasic();
    //砌墙
    public abstract void  buildWalss();
    //封顶
    public abstract void rootfed();

    public void build(){
        buildBasic();
        buildWalss();
        rootfed();
    }
}

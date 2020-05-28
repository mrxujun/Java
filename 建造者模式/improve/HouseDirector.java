package com.xj.build.improve;

import org.omg.PortableInterceptor.HOLDING;

public class HouseDirector {
    HouseBuilder houseBuilder = null;
    //构造器传入
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程，交给指挥者
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalss();
        houseBuilder.rootfed();
        return houseBuilder.buildHouse();
    }
}

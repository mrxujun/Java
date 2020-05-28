package com.xj.build.improve;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalss() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void rootfed() {
        System.out.println("普通房子盖屋顶");
    }
}

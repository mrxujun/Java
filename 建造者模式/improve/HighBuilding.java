package com.xj.build.improve;

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼房子打地基");
    }

    @Override
    public void buildWalss() {
        System.out.println("高楼房子砌墙");
    }

    @Override
    public void rootfed() {
        System.out.println("高楼房子封顶");
    }
}

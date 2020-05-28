package com.xj.build.传统方式;

import com.xj.build.传统方式.AbstractHouse;

public class CommonHouse extends AbstractHouse {
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
        System.out.println("普通房子封顶");
    }
}

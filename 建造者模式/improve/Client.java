package com.xj.build.improve;
//Stringbuider是建造者模式
public class Client {
    public static void main(String[] args) {
      HouseDirector houseDirector =   new HouseDirector(new HighBuilding());
      houseDirector.constructHouse();
    }
}

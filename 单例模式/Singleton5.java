package com.xj.singleton;

public class Singleton5 {
    public static void main(String[] args) {
        Singletond instance = Singletond.getInstance();
        Singletond instance2 = Singletond.getInstance();
        System.out.println(instance == instance2);
    }

}

class Singletond{
    private Singletond(){};
    //静态内部类
    //外部内加载的时候内部类不会加载
    //推荐使用
    private  static class SingletonInstance{
        private static  final  Singletond INSTANCE = new Singletond();
    }

    public static synchronized  Singletond getInstance(){
        return  SingletonInstance.INSTANCE;
    }
}

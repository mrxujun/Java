package com.xj.singleton;

public class Singleton4 {
    public static void main(String[] args) {
        Singletonc instance = Singletonc.getInstance();
        Singletonc instance2 = Singletonc.getInstance();
        System.out.println(instance == instance2);
    }
}

class Singletonc{
    private  static volatile Singletonc instance;
    private  Singletonc(){}
    //提供一个静态的公有方法，加入双重检查代码

    public  static  Singletonc getInstance(){
        if(instance == null){
            synchronized (Singletonc.class){
                if(instance == null){
                    instance = new Singletonc();
                }
            }

        }
        return instance;
    }
}


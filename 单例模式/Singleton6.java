package com.xj.singleton;
//枚举
//比较好用
public class Singleton6 {
    public static void main(String[] args) {
       Singletone instance = Singletone.INSTANCE;
       Singletone instance2 = Singletone.INSTANCE;
       System.out.println(instance == instance2);
       System.out.println(instance.hashCode());
       System.out.println(instance2.hashCode());
       instance.sayOK();
    }
}

enum Singletone{
    INSTANCE;
    public void sayOK(){
        System.out.println("ok");
    }
}

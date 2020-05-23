package com.xj.singleton;
//单例模式就是一个类只能实例化一个对象
public class Singleton1 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
}

//饿汉式（静态变量实现实现）
class  Singleton{
    //构造器私有化
    private  Singleton (){

    }
    //本类内部创建对象实例
    private final  static  Singleton instance = new Singleton();
    //对外提供一个公有的静态方法，返回实例对象
    public static  Singleton getInstance(){
        return  instance;
    }
}


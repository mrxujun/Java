package com.xj.singleton;

public class Singleton3 {
    public static void main(String[] args) {
        Singletona instance = Singletona.getInstance();
        Singletona instance2 = Singletona.getInstance();
        System.out.println(instance == instance2);

    }
}
class Singletonb{
    private  static  Singletonb instance;
    private  Singletonb(){}
    //提供一个静态的公有方法，当使用到该方法时，才会创建instance,加入了同步处理的代码
    //效率低，不好
    public  static synchronized Singletonb getInstance(){
        if(instance == null){
            instance = new Singletonb();
        }
        return instance;
    }
}

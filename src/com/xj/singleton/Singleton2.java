package com.xj.singleton;
//方式2
public class Singleton2 {
    public static void main(String[] args) {
        Singletona instance = Singletona.getInstance();
        Singletona instance2 = Singletona.getInstance();
        System.out.println(instance == instance2);

    }
}

class Singletona{
    private  static  Singletona instance;
    private  Singletona(){}
    //提供一个静态的公有方法，当使用到该方法时，才会创建instance
    //缺点：多线程会产生多个实例
    public  static  Singletona getInstance(){
        if(instance == null){
            instance = new Singletona();
        }
        return instance;
    }
}

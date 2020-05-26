package com.xj.prototype;

import sun.java2d.opengl.WGLSurfaceData;
//原型模式
//创建新的对象比较复杂时，可以利用原型模式简化对象的创建过程，不用重新初始化对象，如果原始对象发生变化，其他克隆的对象也会发生相应的变化。
//缺点：对每一个类都需要配克隆方法,但对已有的类进行克隆就需要改变源代码，违背了ocp原则。
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom",1, "白色");
        Sheep sheep2 = (Sheep)sheep.clone();
        System.out.println(sheep2);
        System.out.println(sheep);
    }
}

package com.xj.prototype;

import java.io.Serializable;
//深拷贝
public class DeepCloneableTarget implements Serializable, Cloneable {
    private static  final  long serialVersionUID = 1l;
    private String cloneName;
    private String cloneClass;
    public DeepCloneableTarget(String cloneName, String cloneClass){
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

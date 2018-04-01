package com.qgl.study.BridgeDesing;

/**
 * 定义抽象部分的接口
 * @Author qiangl
 * Created by qgl on 2018/3/20.
 */
public abstract class Abstraction {

    /**
     * 持有一个实现部分的对象
     */
    protected Implementor impl;

    public Abstraction (Implementor impl){
        this.impl = impl;
    }

    /**
     * 示例操作，实现一定的功能，可能需要转调实现部分的具体实现方法
     */
    public void operation(){
        impl.operationImpl();
    }
}

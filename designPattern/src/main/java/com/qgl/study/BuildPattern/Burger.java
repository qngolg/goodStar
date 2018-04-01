package com.qgl.study.BuildPattern;

/**
 * 汉堡包
 * @Author qiangl
 * Created by qgl on 2018/3/28.
 */
public abstract class Burger implements Item {

    //包装方式纸质包装
    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();

}

package com.qgl.study.BuildPattern;

/**
 * 冷饮
 * @Author qiangl
 * Created by qgl on 2018/3/28.
 */
public abstract class ColdDrink implements Item{

    //瓶装
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}

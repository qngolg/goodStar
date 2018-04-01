package com.qgl.study.BuildPattern;

/**
 * 素食汉堡
 * @Author qiangl
 * Created by qgl on 2018/3/28.
 */
public class VegBurger extends Burger {
    public String name() {
        return "Veg Burger 素食汉堡";
    }

    public float price() {
        return 25.0f;
    }
}

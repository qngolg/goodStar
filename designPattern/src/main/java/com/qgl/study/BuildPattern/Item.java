package com.qgl.study.BuildPattern;

/**
 * 食物接口
 * @Author qiangl
 * Created by qgl on 2018/3/28.
 */
public interface Item {
    //名称
    public String name();
    //包装方式
    public Packing packing();
    //价格
    public float price();
}

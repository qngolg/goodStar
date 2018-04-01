package com.qgl.study.simpleFactoryDesign;

/**
 * 简单工厂设计模式
 *
 *
 * 客户端使用Api接口
 * @des  简单工厂原理：主要创建一个简单工厂对象，让简单工厂对象来负责创建接口对象，然后让客户端通过工厂
 * 来获取接口对象，不再由客户端自己去创建接口的对象了，
 * 客户端与Impl实现类 完全无关联 实现接口的“封装隔离”思想
 * @Author qiangl
 * Created by qgl on 2018/3/8.
 */
public class Client {
    public static void main(String[] args) {
        Api api = Factory.createApi(1);
        api.operation("正在使用简单工厂");


        Api api1 = Factory.creatApi();
        api1.operation("使用配置文件创建实现");
    }
}

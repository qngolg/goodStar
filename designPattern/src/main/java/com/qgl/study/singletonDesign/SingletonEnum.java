package com.qgl.study.singletonDesign;

/**
 *
 * java的枚举实质上是功能齐全的类，因此可以有自己的属性和方法
 * 枚举的基本思想，通过公有的静态final域为每个枚举常量导出实例的类
 * 从某个角度讲，枚举是单例的泛型化，本质上是单元素的枚举
 * @Author qiangl
 * Created by qgl on 2018/3/14.
 */
public enum SingletonEnum {

    /**
     * 定义一个枚举的元素，它代表了Singleton的一个实例
     */
    uniqueInstance;

    /**
     * 示意方法，单例可以有自己的操作
     */
    public void singletonOperation(){

    }
}

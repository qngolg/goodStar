package com.qgl.study.simpleFactoryDesign;

/**
 * @Des 简单工厂模式 接口定义
 * @Author qiangl
 * Created by qgl on 2018/3/8.
 */
public interface Api extends Cloneable {

    /**
     * 示意，具体的功能方法的定义
     * @param s 需要的参数
     */
    public void operation(String s);

    //结合原型模式下的工厂模式，返回Clone对象
    public Object clone();

}

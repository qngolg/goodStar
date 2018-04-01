package com.qgl.study.PrototypePattern;

/**
 * 原型模式demo
 * @Author qiangl
 * Created by qgl on 2018/3/28.
 */
public class PrototypePatternDemo {


    public static void main(String[] args) {

        //加载缓存
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}

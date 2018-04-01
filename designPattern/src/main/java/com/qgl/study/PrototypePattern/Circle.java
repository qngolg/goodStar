package com.qgl.study.PrototypePattern;

/**
 * @Author qiangl
 * Created by qgl on 2018/3/28.
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle 圆形";
    }

    void draw() {
        System.out.println("Inside Circle圆形::draw() method");
    }
}

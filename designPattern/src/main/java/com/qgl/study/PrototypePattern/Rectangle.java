package com.qgl.study.PrototypePattern;

/**
 * 长方形
 * @Author qiangl
 * Created by qgl on 2018/3/28.
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle 长方形";
    }

    void draw() {
        System.out.println("Inside Rectangle 长方形::draw() method");
    }
}

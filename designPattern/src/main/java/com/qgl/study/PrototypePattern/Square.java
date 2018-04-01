package com.qgl.study.PrototypePattern;

/**
 * @Author qiangl
 * Created by qgl on 2018/3/28.
 */
public class Square extends Shape {

    void draw() {
        System.out.println("Inside Square正方形::draw() method");
    }

    public Square(){
        type = "Square 正方形";
    }

}

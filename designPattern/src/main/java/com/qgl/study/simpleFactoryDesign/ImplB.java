package com.qgl.study.simpleFactoryDesign;

/**
 * 接口的具体实现对象B
 * @Author qiangl
 * Created by qgl on 2018/3/8.
 */
public class ImplB implements Api {
    public void operation(String s) {
        //实现功能的代码
        System.out.println("ImplB s == " + s);
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

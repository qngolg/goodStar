package com.qgl.study.factoryMethodDesign;

/**
 * 工厂方法模式
 * 将工厂选择实现类的实现方法继承到子类去选择
 * @Author qiangl
 * Created by qgl on 2018/3/9.
 */
public class Client {

    public static void main(String[] args) {
        //创建需要使用的Creator对象
        ExportOperate operate = new ExportDBOperate();
        //调用输出数据的功能方法
        operate.export("测试数据");
    }
}

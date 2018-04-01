package com.qgl.study.factoryMethodDesign;

/**
 * 工厂方法模式
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类，Factory Method使一个雷的实例化延迟到其子类
 * @Author qiangl
 * Created by qgl on 2018/3/8.
 */
public interface ExportFileApi {

    /**
     * 导出内容成文件
     * @param data 需要保存的数据
     * @return 是否导出成功
     */
    public boolean export(String data);
}

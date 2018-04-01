package com.qgl.study.factoryMethodDesign;

/**
 * 实现导出数据的业务功能对象
 * @Author qiangl
 * Created by qgl on 2018/3/8.
 */
public abstract class ExportOperate {

    /**
     * 导出文件
     * @param data 需要保存的数据
     * @return 是否成功导出文件
     */
    public boolean export(String data){
        ExportFileApi api = factoryMethod();
        return api.export(data);
    }

    /**
     * 工厂方法，创建导出的文件对象的接口对象
     * @return
     */
    protected abstract ExportFileApi factoryMethod();
}

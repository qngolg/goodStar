package com.qgl.study.factoryMethodDesign;

/**
 * 具体的创建器实现对象,实现创建导出成数据库备份文件形式的对象
 * @Author qiangl
 * Created by qgl on 2018/3/9.
 */
public class ExportDBOperate extends ExportOperate {
    protected ExportFileApi factoryMethod() {
        //创建导出成数据库备份文件形式的对象
        return new ExportDB();
    }
}

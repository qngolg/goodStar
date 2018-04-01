package com.qgl.study.factoryMethodDesign;

/**
 * 导出成数据库备份文件形式的对象
 * @Author qiangl
 * Created by qgl on 2018/3/8.
 */
public class ExportDB implements ExportFileApi {
    public boolean export(String data) {
        System.out.println("导出数据"+data+"到数据库备份文件");
        return true;
    }
}

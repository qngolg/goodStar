package com.qgl.study.factoryMethodDesign;

/**
 * 导出成文本文件形式的对象
 * @Author qiangl
 * Created by qgl on 2018/3/8.
 */
public class ExportTxtFile implements ExportFileApi {

    public boolean export(String data) {
        //这里操作文件
        System.out.println("导出数据"+data+"到文本文件");
        return false;
    }
}

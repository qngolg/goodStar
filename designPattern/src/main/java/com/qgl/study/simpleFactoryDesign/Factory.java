package com.qgl.study.simpleFactoryDesign;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Des 工厂类，用来创造Api对象
 * @Author qiangl
 * Created by qgl on 2018/3/8.
 */
public class Factory {


    public static Api createApi(int condition){

        //根据某些条件去选择究竟创建哪一个具体的实现对象
        //这些条件可以从外部传入，也可以从其他途径获取
        //如果只有一个实现，可以省略条件，因为没有选择的必要
        //示意使用条件
        Api api = null;
        if(condition == 1){
            api = new ImplA();
        }else if(condition == 2){
            api = new ImplB();
        }
        return api;
    }

    /**
     * 具体的创造Api的方法，根据配置文件的参数来创建接口
     * @return
     */
    public static Api creatApi(){
        //直接读取配置文件来获取需要创建的实例的类
        Properties properties = new Properties();
        InputStream in = null;
        try {
            in = Factory.class.getResourceAsStream("/FactoryTest.properties");
            properties.load(in);
        } catch (IOException e) {
            System.out.println("装载工厂配置文件出错了,具体的堆栈信息如下：");
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //用反射区创建实现类
        Api api = null;
        try {
            api = (Api)Class.forName(properties.getProperty("ImplClass")).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return api;
    }

    /**
     * 利用反射机制，可以解决没增加一个产品 需要增加对象实现方法
     * 使用时可以采用强制转换
     * @param clazz
     * @return
     */
    public static Object getClass(Class<?extends Api> clazz){

        Object obj = null;

        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return obj;
    }


    /**
     * 利用泛型 省略类型的强制转换，支持多态
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T getClassT(Class<?extends T> clazz){
        T obj = null;
        try {
            obj = (T) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return obj;
    }


}

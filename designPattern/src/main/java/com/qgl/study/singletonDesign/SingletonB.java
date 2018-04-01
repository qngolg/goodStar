package com.qgl.study.singletonDesign;

/**
 * 饿汉模式
 *
 * @Author qiangl
 * Created by qgl on 2018/3/9.
 */
public class SingletonB {

    /**
     * 定义一个变量来存储创建好的类实例，直接新建类实例
     * static 特性：
     *      static变量在类装载的时候进行初始化
     *      多个实例的static变量会共享同一块内存区域
     * 在java中 static变量只会被初始化一次 就是在类加载的时候 多个实例共享的一个内存空间
     */
    //直接在这里创建类实例，只会创建一次
    private static SingletonB uniqueInstance = new SingletonB();

    /**
     * 私有构造方法
     */
    private SingletonB(){

    }

    /**
     * 定义一个方法来提供类实例
     * @return
     */
    //这个方法里面就不需要控制代码
    public static SingletonB getInstance(){
        //直接返回已经创建好的实例
        return uniqueInstance;
    }
}

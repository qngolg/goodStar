package com.qgl.study.singletonDesign;

/**
 * 懒汉单例
 * @Author qiangl
 * Created by qgl on 2018/3/9.
 */
public class SingletonA {

    /**
     * 定义一个变量来存储创建好的类实例
     */
    private static SingletonA uniqueInstance = null;

    /**
     * 私有化构造方法
     */
    private SingletonA(){

    }

    /**
     * 定义一个方法来提够类实例
     * 同步方法 防止线程不安全
     * @return
     */
    public static synchronized SingletonA getInstance(){
        /**
         * 这里体现了延迟加载，一开始不记载资源或数据，一直等到要使用该资源的时候再加载
         * Lazy Load 延迟加载
         */
        //判断存储实例的变量是否有值
        if(uniqueInstance == null){
            //如果没有，就创建一个类实例
            uniqueInstance = new SingletonA();
        }
        return uniqueInstance;
    }

    /**
     * 示意方法，单例可以有自己的操作
     */
    public void singletonOperation(){}

    /**
     * 示意属性，单例可以有自己的属性
     */
    private String singletonData;
}

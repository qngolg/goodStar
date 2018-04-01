package com.qgl.study.singletonDesign;

/**
 * Lazy initialization holder class 单例模式
 * 综合使用了Java的类级内部类和多线程缺省同步锁的知识，很巧妙的同时实现了延迟加载和线程安全
 * @Author qiangl
 * Created by qgl on 2018/3/14.
 */
public class LazyInitializationHolderSingleton {
    /**
     * 类级内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     * 没有绑定关系，而且只有被调用到才会装载，从而实现了延迟加载
     */
    private static class SingletonHolder{
        /**
         * 静态初始化器，由jvm来保证线程安全
         */
        private static LazyInitializationHolderSingleton instance = new LazyInitializationHolderSingleton();
    }

    /**
     * 私有化构造方法
     */
    private LazyInitializationHolderSingleton(){}

    public static LazyInitializationHolderSingleton getInstance(){
        return SingletonHolder.instance;
    }

    /**
     * tip
     * getInstance方法第一次被调用的时候，它第一次读取SingletonHolder.instance,
     * 导致SingletonHolder类得到初始化；而这个类在装载并被初始化的时候，会初始化它的静态域
     * 从而实现LazyInitializationHolderSingleton的实例，由于静态的域，因此只会被虚拟机在
     * 装载类的时候初始化一次，并由jvm来保证线程安全性
     *  这个模式的优势在于，getInstance方法并没有被同步，并且只是执行一个域的方法，因此延迟加载，
     *  没有增加任何访问成本
     */
}

package com.qgl.study.singletonDesign;

/**
 * 双重检查加锁式  懒汉模式
 * 线程安全 且性能不受影响
 * 双重检查加锁式机制: 并不是每次进入getInstance方法都需要同步
 * ，而是先不同步 ，先检查实例是否存在，如果不存在才进入下面的同步块 这是第一重检查
 *  进入同步块过后，再检查实例是否存在，如果不存在，就在同步的情况下创建一个实例，这是第二重检查
 *
 *  volatile
 *  被volatile修饰的变量的值，将不会被本地线程缓存，所以对该变量的读写都是
 *  直接操作共享内存，从而确保多个线程能正确的处理该变量
 * @Author qiangl
 * Created by qgl on 2018/3/9.
 */
public class Singleton {

    private volatile static Singleton instance = null;

    private Singleton(){}

    public static Singleton getInstance(){
        //检查实例是否存在，如果不存在才进入下面的同步块
        if (instance == null){
            synchronized (Singleton.class){
                //再次检查实例是否存在，如果不存在才真正的创建实例
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /**
     * tip：
     * volatile关键字可能会屏蔽掉虚拟机中的一些必要的代码优化
     * 所以运行效率并不是很高，
     * 一般建议，没有特别的需要，不要使用双重加锁单例模式
     */
}

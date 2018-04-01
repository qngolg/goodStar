package com.qgl.study.singletonDesign;

import java.util.HashMap;
import java.util.Map;

/**
 * 简单演示如何扩展单例模式，控制实例数目为3个
 * @Author qiangl
 * Created by qgl on 2018/3/14.
 */
public class OneExtend {

    /**
     * 定义一个缺省的key值的前缀
     */
    private final static String DEFAULT_PREKEY = "Cache";

    /**
     * 缓存实例的容器
     */
    private static Map<String,OneExtend> map = new HashMap<String, OneExtend>();

    /**
     * 用来记录当前正在使用第几个实例，到了控制的最大数目，从1开始
     */
    private static int num = 1;

    /**
     * 定义控制实例的最大数目
     */
    private final static int NUM_MAX = 3;

    private OneExtend(){}

    public static OneExtend getInstance(){

        String key = DEFAULT_PREKEY + num;
        //缓存的体现，通过控制缓存的数据多少来控制实例数目
        OneExtend oneExtend = map.get(key);
        if(oneExtend == null){
            oneExtend = new OneExtend();
            map.put(key,oneExtend);
        }

        //吧当前实例的序号加1
        num++;
        if(num > NUM_MAX){
            //如果实例的序号已经达到最大数目了，那就重复从1开始
            num = 1;
        }
        return oneExtend;
    }

    public static void main(String[] args) {
        //测试是否能满足功能要求
//        OneExtend t1 = getInstance();
//        OneExtend t2 = getInstance();
//        OneExtend t3 = getInstance();
//        OneExtend t4 = getInstance();
//        OneExtend t5 = getInstance();
//        OneExtend t6 = getInstance();
//        System.out.println("t1=="+t1);
        String fen = "1";
        System.out.println(fentoyuan(fen));
        Map a = new HashMap();
    }

    public static String fentoyuan(String fen){
        Integer a = Integer.parseInt(fen);
        Float b = a.floatValue()/100;
        return String.valueOf(b);
    }


}

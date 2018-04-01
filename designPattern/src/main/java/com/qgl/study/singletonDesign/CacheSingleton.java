package com.qgl.study.singletonDesign;

import java.util.HashMap;
import java.util.Map;

/**
 * java中缓存的基本实现实例
 * @Author qiangl
 * Created by qgl on 2018/3/9.
 */
public class CacheSingleton {


    /**
     * 缓存数据的容易，定义Map方便访问
     */
    private static Map<String,Object> map = new HashMap<String, Object>();

    public Object getValue(String key){

        //先从缓存里面取值
        Object obj = map.get(key);
        //判断缓存里面是否有值
        if(obj == null){
            //如果没有，那么就去获取相应的数据
            obj = "newValue";
            //将获取的值设置回到缓存里面
            map.put(key,obj);
        }
        //如果有值了，就直接返回使用
        return obj;
    }

}

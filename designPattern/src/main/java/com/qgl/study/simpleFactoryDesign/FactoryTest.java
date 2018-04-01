package com.qgl.study.simpleFactoryDesign;

/**
 * 工厂类 通过
 * @Author qiangl
 * Created by qgl on 2018/3/8.
 */
public class FactoryTest {

    public static Api createApiA(int condition){
        Api api = null;
        if(condition == 1){
            api = new ImplA();
        }else if(condition == 2){
            api = new ImplB();
        }
        return (Api) api.clone();
    }
}

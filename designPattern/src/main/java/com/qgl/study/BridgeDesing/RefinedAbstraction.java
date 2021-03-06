package com.qgl.study.BridgeDesing;

/**
 * 扩充有AbStraction定义的接口功能
 * @Author qiangl
 * Created by qgl on 2018/3/20.
 */
public class RefinedAbstraction extends Abstraction{
    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    /**
     * 示例操作，实现一定的功能
     */
    public void otherOperation(){
        //实现一定的功能，可能会使用具体实现部分的实现方法
        //但是笨方法更大的可能是使用Abstraction中定义的方法
        //通过组合使用Abstraction中定义的方法来完成更多的功能
    }
}

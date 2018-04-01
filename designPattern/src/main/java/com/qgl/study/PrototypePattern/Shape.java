package com.qgl.study.PrototypePattern;

/**
 * 实现了Clonable接口的抽象类
 * @Author qiangl
 * Created by qgl on 2018/3/28.
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    /**
     * clone方法是一个native方法 效率高，主要用于对象的拷贝
     * clone方法不走构造方法
     * @return
     */
    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

package com.qgl.study.PrototypePattern.CloneDemo;

/**
 * 浅clone
 *
 * @Author qiangl
 * Created by qgl on 2018/3/28.
 */
public class ShallowClone implements Cloneable {

    private String name;
    private Integer a;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShallowClone(String name) {
        this.name = name;
    }

    //其包含的String对象 在clone之后 依然== 说明为同一对象
    public static void main(String[] args) throws CloneNotSupportedException {

        String name = "test"; //String对象
        ShallowClone clone = new ShallowClone(name);
        clone.a = 1;
        ShallowClone clone1 = (ShallowClone) clone.clone();
        clone.a = clone.a ++;
        System.out.println("clone == clone1 :" + (clone == clone1));
        System.out.println("clone.name == clone1.name :" + (clone.name == clone1.name));
        System.out.println(clone.a);
        System.out.println(clone1.a);
    }
}

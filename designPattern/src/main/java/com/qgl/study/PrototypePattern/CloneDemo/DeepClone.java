package com.qgl.study.PrototypePattern.CloneDemo;

import java.io.*;

/**
 * @Author qiangl
 * Created by qgl on 2018/3/28.
 */
public class DeepClone implements Cloneable,Serializable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepClone(String name) {
        this.name = name;
    }

    public Object deepClone() throws IOException, ClassNotFoundException {

        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bo);
        out.writeObject(this);

        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return oi.readObject();

    }

    //深Clone 其内部包含的类为不同对象
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String name = "test";
        DeepClone deepClone = new DeepClone(name);
        DeepClone deepClone1 = (DeepClone) deepClone.deepClone();

        System.out.println("deepClone == deepClone1   :" + (deepClone == deepClone1));
        System.out.println("deepClone.name == deepClone1.name  :  " + (deepClone.name == deepClone1.name));

    }
}

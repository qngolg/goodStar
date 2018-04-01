package com.qgl.study.BuildPattern;

import java.util.*;

/**
 * 食物菜单
 * @Author qiangl
 * Created by qgl on 2018/3/28.
 */
public class Meal  {

    private List<Item> items = new ArrayList<Item>();

    //添加食物
    public void addItem(Item item){
        items.add(item);
    }

    //计算总价
    public float getCost(){
        float cost = 0.0f;
        for(Item item:items){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items){
            System.out.print("Item 食物: " + item.name());
            System.out.print(",Packing 包装 ： "+ item.packing().pack());
            System.out.println(",Price 单价： " + item.price());
        }
    }
}

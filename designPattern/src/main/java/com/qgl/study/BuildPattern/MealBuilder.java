package com.qgl.study.BuildPattern;

/**
 * 食物套餐
 * @Author qiangl
 * Created by qgl on 2018/3/28.
 */
public class MealBuilder {

    public Meal prepareVegMeal(){

        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}

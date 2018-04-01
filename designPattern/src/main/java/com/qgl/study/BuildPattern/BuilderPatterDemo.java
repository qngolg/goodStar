package com.qgl.study.BuildPattern;

/**
 * @Author qiangl
 * Created by qgl on 2018/3/28.
 */
public class BuilderPatterDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal 素食菜单");
        vegMeal.showItems();
        System.out.println("Total Cost 总价:" + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal 非素食菜单");
        nonVegMeal.showItems();
        System.out.println("Total Cost 总价:" + nonVegMeal.getCost());
    }

}

package cn.itcast06;

import java.util.Random;

//定义动物类
public class Animal {

    //封装的步骤 1 属性私有化
    //成员变量
    private int age;//0
    private String breed;//null

    //2 对外提供公开的get/set方法

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    //成员方法
    public void eat() {
        System.out.println(breed + "正在吃东西");
    }

    public void sleep() {
        System.out.println(breed + "正在养精蓄锐");
    }

    public void show() {

        Random random = new Random();

        System.out.println(breed + age + "岁了");
    }

    //无参构造方法
    public Animal() {
    }

    //带参构造方法
    public Animal(int age, String breed) {
        this.age = age;
        this.breed = breed;
    }
}

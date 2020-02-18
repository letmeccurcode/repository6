package cn.itcast03;

import java.util.ArrayList;

public class User {

//    ArrayList
    private String name;
    private int age;

    public User(){

    }
    @Override
    public String toString() {
        return name + ":" + age;
    }

    public User(String name,int age){
        this.age = age;
        this.name = name;
    }
//    private  User(String name,int age){
//        this.age = age;
//        this.name = name;
//    }
}

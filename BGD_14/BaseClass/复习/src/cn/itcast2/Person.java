package cn.itcast2;

public class Person {

    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
//        if (name.length() >=0){
//            System.out.println("名称过长不合法!");
//            return;
//        }
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void eat() {
        System.out.println(name + "正在吃东西");
    }

    public void sleep() {
        System.out.println(name + "正在休息");
    }
}

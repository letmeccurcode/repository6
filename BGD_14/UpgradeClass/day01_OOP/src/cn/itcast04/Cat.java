package cn.itcast04;

public class Cat extends Animal {

    public int age = 6;
    @Override
    public void eat() {
        System.out.println("Cat正在吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("");
    }

    @Override
    void catch1() {

    }

    @Override
    protected void liuda() {

    }
}

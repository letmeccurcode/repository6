package cn.itcast04;

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void sleep() {
        System.out.println("狗子在睡觉");
    }

    public void lookdoor(){
        System.out.println("狗子在看门");
    }
}

package cn.itcast3;

@SuppressWarnings("all")
public class Cat extends Animal {

    int age = 8;

    @Override
    public void eat(){
        System.out.println("cat正在吃猫粮");
    }

//    public void eat() {
//        System.out.println("Cat的eat方法执行了");
//    }

    public void show() {
        int age = 3;
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);

        this.eat();
        super.eat();
    }

    public Cat() {
//        super();
        this(10);
    }

    public Cat(int age) {
        super();
        this.age = age;
    }

    public Cat(int age, int age1) {
        super(age);
        this.age = age1;
    }
}

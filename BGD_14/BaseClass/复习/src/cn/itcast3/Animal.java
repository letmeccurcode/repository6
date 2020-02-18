package cn.itcast3;

public class Animal {

    int age = 10;

    public void eat(){
        System.out.println("Animal的eat方法执行了");
    }

    public Animal() {
        super();
    }

    public Animal(int age) {
        this.age = age;
    }
}

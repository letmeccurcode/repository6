package cn.itcast06;

public class TestAnimal {

    public static void main(String[] args) {

        Animal a1 = new Animal();
        a1.setAge(20);
        a1.setBreed("熊猫");

        a1.show();

        Animal a2 = new Animal(18, "老虎");
        a2.show();

        a1.eat();
        a1.sleep();
        a2.eat();
        a2.sleep();
    }
}

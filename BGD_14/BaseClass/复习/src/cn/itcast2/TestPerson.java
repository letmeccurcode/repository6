package cn.itcast2;

public class TestPerson {

    public static void main(String[] args) {

        //实例化对象
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

//        person1.age = 10;
//        person1.name = "张三";


        person1.setAge(10);
        person1.setName("李四");

        person1.eat();
        person1.sleep();
    }
}

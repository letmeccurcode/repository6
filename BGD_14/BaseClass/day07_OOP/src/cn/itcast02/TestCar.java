package cn.itcast02;

//测试类 主要是用来测试创建对象和调用方法的
public class TestCar {

    public static void main(String[] args) {

        //类名 对象名 = new 类名();
        Car c = new Car();

        //调用方法 对象名.方法名();
        c.run();


        //给成员变量赋值
        c.brand = "Honda";
        c.color = "黑色";
        c.price = 12000.0;
        //对象名.属性;
        System.out.println(c.price);
        System.out.println(c.color);
        System.out.println(c.brand);
    }

}

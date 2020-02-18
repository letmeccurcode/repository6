package cn.itcast02;

//定义汽车类
public class Car {

    //定义类不是目的 创建该类的对象并使用其中的成员变量和成员方法才是目的

    //属性 成员变量 定义在类中 方法外 和成员方法是平级关系
    //数据类型 变量名; 成员变量可以没有初始值;类型可以是引用类型 也可以是基本类型
    double price;
    String brand;
    String color;

    //整型 0
    //浮点型 0.0
    //布尔类型 false
    //字符型 \u0000

    //引用类型 null

//    double price = 19000.0;
//    String brand = "BMW";
//    String color = "红色";

    //行为 成员方法
    public void run() {
//        int x = 20;
//        System.out.println(price);
        System.out.println(color + "的" + brand + "牌汽车正在马路上飞驰!");
    }
}

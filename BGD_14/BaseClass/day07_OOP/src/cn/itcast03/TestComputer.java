package cn.itcast03;

public class TestComputer {

    public static void main(String[] args) {

        Computer c1 = new Computer();

        //类名 对象名= new 类名();
        Computer c = new Computer();

        //对象名.方法名();
        c.study();
        c.playGame();

        //给电脑的成员变量赋值
        //对象名.属性名 = 属性值;
//        c.brand = "Apple";
        c.price = 12000.0;
//        c.color = "";
        System.out.println(c.brand + "牌的电脑价格是:" + c.price);
    }
}

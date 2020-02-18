package cn.itcast03;

public class Test {

    public static void main(String[] args) {

        MyInterface m = new MyInterfaceImpl();
        m.show1();

        new MyInterface2() {
            @Override
            public void show() {
                System.out.println("匿名内部类的show方法执行了");
            }
        }.show();

        //如果临时的使用一下一个接口/抽象类的子类对象 本质是创建了实现该接口或者继承了该抽象类的临时对象
        MyInterface2 m2 = new MyInterface2() {
            @Override
            public void show() {
                System.out.println("匿名内部类的show方法执行了");
            }
        };

        m2.show();
    }
}

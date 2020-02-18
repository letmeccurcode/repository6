package cn.itcast02;

public class Test {

    public static void main(String[] args) {

        B b = new B();
        b.show();

        /*
            1 调用B的无参构造方法 B b = new B();
            2 调用B的父类A的有参构造 super(40);
            3 执行父类的有参构造方法时
                a this.num = num; 把接收到的实参赋值给了A的成员变量num -> 10 -> 40
                b 执行输出语句 System.out.println("A的有参构造方法执行了");
            4 执行B的无参构造方法体 System.out.println("B的无参构造方法执行了");
            5 调用b对象的show()方法
                输出局部变量的num
                输出成员变量的num
                输出父类成员变量的num
         */
    }
}

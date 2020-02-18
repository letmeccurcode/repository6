package cn.itcast03;

@SuppressWarnings("all")//压制警告
public class B extends A {

    int num = 10;

    String s = "hello";

    public void m2(){

    }

    public B() {
//        B(20); this(实参) 调用当前类的其他带参构造
//        this()和super()不能同时出现
        this(20);
//        super();
        System.out.println("B的无参构造方法执行!");
    }

    public B(int num) {
        super();
        this.num = num;
        System.out.println("B的有参构造方法执行!");
    }

//    public void print(){
    @Override//表示方法的重写
    public void print() {
        System.out.println("B的print方法执行了");
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
    }
}

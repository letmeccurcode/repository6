package cn.itcast02;

public class Test01 {

    public static void main(String[] args) {

        MyThread m = new MyThread();

        Thread t1 = new Thread(m,"张三");
        Thread t2 = new Thread(m,"李四");
        Thread t3 = new Thread(m,"王五");

//        new Thread()

        t1.start();
        t2.start();
        t3.start();
    }
}

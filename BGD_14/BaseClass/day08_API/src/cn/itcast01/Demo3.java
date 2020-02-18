package cn.itcast01;

public class Demo3 {

    public static void main(String[] args) {

        //引用类型作为参数传递 形参的改变会影响到实参
        //直接赋值定义的字符串作为参数传递 形参的改变不会影响实参
        //原因字符串的改变不会再原有字符串的基础之上改变而是会产生一个新的字符串对象

        //堆(字符串常量池)  栈
        String s = "Hello";
        System.out.println("main开始:" + s);//Hello
        change(s);
        System.out.println("main结束:" + s);//Hello
    }

    private static void change(String s) {
        System.out.println("change开始:" + s);//Hello
        s += "world";//s = s + "world"; Helloworld
        System.out.println("change结束:" + s);//Helloworld
    }
}

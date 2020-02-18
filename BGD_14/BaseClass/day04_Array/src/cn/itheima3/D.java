package cn.itheima3;

public interface D {

    //默认方法 静态方法都有方法体
    public static void m1(){
        System.out.println("这是一个静态方法");
    }

    //不能通过子实现类的对象调用接口当中的静态方法
    //通过接口名调用
}

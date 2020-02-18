package cn.itheima3;

/*
    接口的默认方法 可以通过接口实现类对象直接调用
    接口的默认方法 也可以被接口实现类进行覆盖重写
 */
public interface C {

    void m1();

    default void m2(){
        System.out.println("我是一个默认方法");
    }

    public default void m3(){

    }
//    void m2();
    /*public default void m1(){

    }*/
}

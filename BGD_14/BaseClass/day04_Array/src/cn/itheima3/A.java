package cn.itheima3;

//java8开始接口中允许定义默认方法 允许有方法体 是为了解决接口升级问题
public interface A {

    public abstract void m1();

    public void m2();

    void m3(int i);

    int m4();

    public default void m5(){

    }
}

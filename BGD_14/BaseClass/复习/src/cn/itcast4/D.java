package cn.itcast4;

public class D implements C {

    @Override
    public void m1() {
        System.out.println(C.x);
        System.out.println(C.y);
    }

    @Override
    public void m2() {

    }
}

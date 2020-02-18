package cn.itcast4;

public class B extends A {

    public class InnerB{

    }

    @Override
    public void m1() {
        int x = 10;

        class InnerM1{

        }

    }

    public B(){
        super();
    }
}

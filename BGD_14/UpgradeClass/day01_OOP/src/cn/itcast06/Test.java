package cn.itcast06;

import java.util.ArrayList;

public class Test {

    int [] arr;

    ArrayList<String> list = new ArrayList<>();


    public static void main(String[] args) {

        A a = new B();

//        String
        System.out.println(a.num);
        a.m1();

//        a.m2();

        if(a instanceof B){
            B b = (B)a;
            b.m2();
            System.out.println(b.num);
        }
    }
}

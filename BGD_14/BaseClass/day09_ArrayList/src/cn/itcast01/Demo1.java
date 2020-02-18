package cn.itcast01;

import java.util.ArrayList;

public class Demo1 {

    public static void main(String[] args) {

        //<泛型约束>
        ArrayList<String> list = new ArrayList<String>();

//        System.out.println(list.size());

        list.add("java");
        list.add("C++");
        list.add("PHP");

//        System.out.println(list);

//        list.add(0, "python");
//        System.out.println(list);

        for (int i = 0;i < list.size();i++){
            String s = list.get(i);
            System.out.println(s);
        }


    }

    @SuppressWarnings("")
    public void m1(){

    }

    static int a = 10;
}

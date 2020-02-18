package cn.itcast04;

import cn.itcast03.Computer;

public class Demo1 {

    //使用不同包下的类 需要导包
    public static void main(String[] args) {

        //引用类型相互赋值 赋的是内存地址值
        int[] arr1 = new int[4];
        System.out.println(arr1);
        int [] arr2 = arr1;
        System.out.println(arr2);

        Computer c = new Computer();
        System.out.println(c);
        Computer c2 = c;
        System.out.println(c2);

        //在类文件中定义的位置不同
    }



}

package cn.itcast04;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Student s1 = new Student(33, "zhangsan");//0x123

        Student s2 = new Student(33, "zhangsan");//0x456

        //以后比较两个对象是否是同一个要比较他们的属性值是否相同而不是比较内存地址值

        System.out.println(s1.equals(s2));
//        System.out.println
//        System.out.println(s);//Object
//        System.out.println(s.toString());//String

        //定义好一个类之后 顺便重写好他的toString方法
        //println(s);

        ArrayList<String> list = new ArrayList<>();

        list.add("hello");
        list.add("java");
        System.out.println(list);

        String s3 = new String("halo");
        System.out.println(s1);

        int [] arr = {3,1,5,7,2};
        SortUtils.bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }
}

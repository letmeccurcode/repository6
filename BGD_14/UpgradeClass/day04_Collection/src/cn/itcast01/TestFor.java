package cn.itcast01;

import java.util.ArrayList;
import java.util.List;

public class TestFor {

    public static void main(String[] args) {
        //for(数据类型 变量名:目标数组名/集合名){}

        int[] arr = {1, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            if (i == 1) {
                break;
            }
            System.out.println(arr[i]);
        }

        for (int i : arr) {
            System.out.println(i);
        }
        //迭代器是集合的 数组没有迭代器
        //增强for遍历数组 底层使用的还是带索引的for循环

        //增强for没有索引,无法对循环进行控制判断 适合纯遍历
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("java");
        list.add("world");

        for (String str : list) {
            System.out.println(str);
        }
        //增强for遍历集合 底层使用的是迭代器
    }
}

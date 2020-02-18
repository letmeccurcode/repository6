/*
package cn.itcast04_comparable_泛型类实现comparable接口;

import javafx.concurrent.Worker;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        //创建集合
        List<Worker> list = new ArrayList<Worker>();

        Worker w1 = new Worker("凤姐", 18, 20000);
        Worker w2 = new Worker("欧阳锋", 60, 8000);
        Worker w3 = new Worker("刘德华", 18, 40000);
        //添加对象
        Worker w4 = new Worker("张柏芝", 20, 4000);
        list.add(w1);
        list.add(w2);
        list.add(w3);
//        list.add(w4);
*/
/*
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //获取对象
            Worker w = list.get(i);
            //如果对象名字是欧阳锋
            if (w.getName().equals("欧阳锋")) {
                //就把张柏芝放在欧阳锋的位置上
                list.add(i, w4);
                //结束循环
                break;
            }
        }

        System.out.println(list);*//*


        for (Worker w : list) {//next()方法
            //如果当前元素的名字是刘德华 就移除
            System.out.println(666);
            if (w.getName().equals("刘德华")) {
                list.remove(w);
//                break;
            }
        }


*/
/*        System.out.println(list);
        for (Worker w : list) {
            System.out.println(w);
        }*//*

    }
}*/

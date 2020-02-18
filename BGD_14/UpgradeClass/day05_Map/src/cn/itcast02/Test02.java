package cn.itcast02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {

        //创建集合对象 准备了一个容器
        ArrayList<Worker> list = new ArrayList();

        //实例化三个worker对象
        Worker w1 = new Worker("凤姐", 18, 20000.0D);
        Worker w2 = new Worker("欧阳锋", 60, 8000.0D);
        Worker w3 = new Worker("刘德华", 18, 40000.0D);

        //将对象存入到集合中
        list.add(w1);
        list.add(w2);
        list.add(w3);

/*        for (Worker w : list) {
            //获取到当前员工的姓名
            String name = w.getName();
            //判断name是否是刘德华 如果是就删除
            if(name.equals("刘德华")){
                list.remove(w);
                break; //如果没有break 就抛出ConcurrentModificationException
            }
        }
        System.out.println(list);*/

        //获取到ArrayList集合的迭代器对象 内部已经实现了hasNext和next两个方法
        Iterator var6 = list.iterator();
        while (var6.hasNext()) {
            //this.cursor != ArrayList.this.size;
            //cursor    -> 游标 初始值是0 / cursor 1  / cursor 2 / cursor 3
            //this.size -> 指的是当前集合对象的长度 2

            //next方法取出元素 在添加元素的过程中
            //实际修改次数是会赋值给预期修改次数 预期修改次数是3
            Worker w = (Worker) var6.next();
            //第一次取出的是 凤姐 cursor -> 1
            //第二次取出的是 欧阳锋 cursor -> 2
            //第三次取出的是 刘德华 cursor -> 3

            //实际修改次数原来是3 add方法调用了三次 remove方法 实际修改次数4
            //删除一个元素后集合的长度变成了2
            if (w.getName().equals("刘德华")) {
                list.remove(w);
//                break;
            }
        }
    }
}

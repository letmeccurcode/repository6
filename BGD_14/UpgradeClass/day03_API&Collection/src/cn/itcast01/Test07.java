package cn.itcast01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test07 {

    public static void main(String[] args) {

        Collection<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(11);
        list.add(12);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.println(i);
        }

//        Object
//String
        //1 获取迭代器对象Iterator
        //2 判断下一个位置是否还有可取的元素
        //3 调用next方法获取到下一个位置的元素
        //4 回到第一步继续判断
    }
}

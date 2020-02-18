package cn.itcast01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Test08 {

    public static void main(String[] args) {

        //创建了一个单列集合 存储的类型是int[]数组类型
        Collection<int []> c = new ArrayList<int []>();

        int [] arr1 = {1,2};
        int [] arr2 = {1,2,3};
        int [] arr3 = {1,2,4,5,6};
        int [] arr4 = {1,2,3,4};
        int [] arr5 = {1,2,8};

        c.add(arr1);
        c.add(arr2);
        c.add(arr3);
        c.add(arr4);
        c.add(arr5);

        boolean remove = c.remove(arr1);
        System.out.println(remove);

        System.out.println(c.remove(arr2));

        System.out.println(c.size());
        c.clear();
        System.out.println(c.size());

        //遍历

        Iterator<int[]> it = c.iterator();
        while (it.hasNext()){
            int[] temp = it.next();
            System.out.println(Arrays.toString(temp));
        }
    }
}

package cn.itcast6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Test1 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        Vector<Integer> list3 = new Vector<>();

        for (Integer integer : list1) {
            System.out.println(integer);
        }

        Iterator<Integer> it = list2.iterator();
        while (it.hasNext()){
            Integer next = it.next();
        }

        for (int i = 0; i < list3.size(); i++) {
            Integer j = list3.get(i);
        }

    }
}

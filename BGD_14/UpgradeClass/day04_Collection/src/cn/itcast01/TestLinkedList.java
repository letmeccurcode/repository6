package cn.itcast01;

import java.util.Arrays;
import java.util.LinkedList;

public class TestLinkedList {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("hello1");
        list.add("hello2");
        list.add("hello3");

        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}

package cn.itcast03;

import java.util.HashMap;
import java.util.Hashtable;

public class Test03 {

    public static void main(String[] args) {

        HashMap<String, Integer> map1 = new HashMap<>();
        Hashtable<String, Integer> map2 = new Hashtable<>();

        map1.put("java",20);
        map1.put(null,null);

        System.out.println(map1);

        map2.put("python", 25);
        map2.put(null, null);

        System.out.println(map2);

    }

}

package cn.itcast03;

import java.util.*;

public class Test01 {

    public static void main(String[] args) {

        Map<String, String> m = new HashMap<>();
        new HashSet<String>();

//        System.out.println(m.size());
        m.put("tom", "12");
        m.put("jerry", "11");
        m.put("rose", "14");
        m.put("rose", "13");
        m.put("jack1", "13");
        m.put("jack2", "13");
        m.put("jack3", "13");
        m.put("jack4", "13");

        Set<String> keySet = m.keySet();
        for (String key : keySet) {
            String value = m.get(key);
            System.out.println(key + ":" + value);
        }

        //获取所有键值对对象的集合
        Set<Map.Entry<String, String>> set = m.entrySet();

        for (Map.Entry<String, String> entry : set) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }

//        Set<String> set = m.keySet();
//        System.out.println(set.size());
//
//        System.out.println(set);
//
//        System.out.println(m.size());
//        System.out.println(m);
        //map集合的key是唯一不可重复的 如果添加了重复的元素 后来的元素会把之前的覆盖掉

        //HashMap 和 HashSet集合是同一种数据结构 都是哈希表
        //HashSet是HashMap集合的key部分 HashMap集合的key有啥特点 HashSet集合就有什么特点
    }
}

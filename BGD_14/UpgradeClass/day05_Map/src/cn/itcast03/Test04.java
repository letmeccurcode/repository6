package cn.itcast03;

import java.util.*;

public class Test04 {

    public static void main(String[] args) {

        TreeSet<Character> set = new TreeSet<>();
        set.add('d');
        set.add('b');
        set.add('c');

        System.out.println(set);

        TreeMap<Character, Integer> map = new TreeMap<>();

        map.put('f', 1);
        map.put('a', 2);
        map.put('z', 3);
        map.put('z', 4);
        System.out.println(map);

        Set<Character> keySet = map.keySet();
        Collection<Integer> collection = map.values();

        ArrayList<User> list =new ArrayList<>();

        User u1 = new User("tom", 23);
        User u2 =new  User("tom", 21);
        User u3 =new  User("jerry", 22);
        User u4 =new  User("rose", 22);

        Collections.addAll(list, u1,u2,u3,u4);

        System.out.println(list);

        Comparator c = new Comparator<User>(){
            @Override
            public int compare(User u1, User u2) {
                int num1 = u1.getAge() - u2.getAge();
                int num2 = num1 == 0 ? u2.getName().compareTo(u1.getName()):num1;
                return num2;
            }
        };

        Collections.sort(list, c);

        System.out.println(list);
    }
}

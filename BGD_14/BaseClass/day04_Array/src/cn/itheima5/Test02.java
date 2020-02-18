package cn.itheima5;

public class Test02 {

    public static void main(String[] args) {

        int x = 10;
        double y = 3;
        System.out.println(x / y);

        String str = "hello";
        char c = 'a';
        boolean flag = false;

        Person p = new Person();

        String result = str + x + y + c + flag + p;
        //hello103afalsetom,12
        System.out.println(result);

        String s1 = "java";
        String s2 = "java";

        System.out.println(s1 == s2);

//        x++;
//        ++x;

        int i1 = 3;
        int i2 = ++i1 + i1++ + i1--;
        System.out.println(i2);
        System.out.println(i1);

        int m1 = 10;
        int m2 = 20;

        int result1 = (m1 >= m2 ? m1 : m2);
        System.out.println(result1);
//        System.in
    }
}

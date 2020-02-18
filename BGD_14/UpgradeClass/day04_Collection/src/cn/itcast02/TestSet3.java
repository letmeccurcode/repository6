package cn.itcast02;

public class TestSet3 {

    public static void main(String[] args) {

        String s1 = "Helloworld";
        String s2 = "Helloworld";

        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode() == s2.hashCode());

        //equals方法比较结果相同的对象 hash值也相同
        //hash值相同的两个对象 他们的equals方法比较结果不一定相同

        System.out.println("树人".hashCode() == "方面".hashCode());
        System.out.println("儿女".hashCode() == "农丰".hashCode());

        //创建了一个set集合 里面有999个不重复的字符串 现在我要添加第1000个字符串
        //哈希算法/散列算法
    }
}

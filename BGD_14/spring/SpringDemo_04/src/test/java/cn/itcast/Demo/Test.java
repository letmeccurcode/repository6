package cn.itcast.Demo;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student("张三", 33);
        Student s2 = new Student("张三", 33);
        System.out.println(s1.hashCode() == s2.hashCode());
    }
}

package cn.itcast05;

public class Student {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //构造方法

    //无参构造
    public Student() {
        System.out.println("Student的无参构造方法执行了");
    }

    //带参构造
    public Student(String name, int age) {
        System.out.println("Student的有参构造方法执行了");
        this.name = name;
        this.age = age;
    }

    {
        System.out.println("成员代码块");
    }

    static {
        System.out.println("静态代码块");
    }

    public void show() {
        System.out.println(name + ":" + age);
    }
}

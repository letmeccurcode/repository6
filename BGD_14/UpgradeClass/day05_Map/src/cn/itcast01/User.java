package cn.itcast01;

public class User implements Comparable<User>{

    private String name;
    private int age;


    @Override
    public int compareTo(User user) {
        return 0;
    }
}

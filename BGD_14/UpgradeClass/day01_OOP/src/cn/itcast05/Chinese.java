package cn.itcast05;

public class Chinese {

    //public final static 常量 不允许发生改变的量
    public final static String COUNTRY = "中国";
    public final static String MY_FAMILY_ADDRESS = "深圳";

    String name;
    int age;

    public Chinese() {
    }

    public Chinese(String name, int age) {
        this.name = name;
        this.age = age;
    }

/*    public Chinese(String country, String name, int age) {
        this.country = country;
        this.name = name;
        this.age = age;
    }*/
}

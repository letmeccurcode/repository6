package cn.itcast03;

import java.util.Properties;

public class Test05 {

    public static void main(String[] args) {

        Properties p = new Properties();
//        Properties<String,String> p = new Properties<String,String>();

        p.setProperty("hello", "java");
        p.setProperty("halo", "python");

        //一般用来读取配置文件信息
        System.out.println(p);
    }
}

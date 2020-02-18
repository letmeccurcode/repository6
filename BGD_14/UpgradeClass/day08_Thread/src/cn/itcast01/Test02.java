package cn.itcast01;

import java.util.Properties;
import java.util.Set;

public class Test02 {

    public static void main(String[] args) {

        Properties p = new Properties();

//        User user = new User();
//        p.put(user,user);
//        System.out.println(p);

        p.setProperty("tom", "12");// put
        String tom = p.getProperty("tom");// get
        Set<String> names = p.stringPropertyNames();//keySet
    }
}

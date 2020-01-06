package cn.itcast.dao.impl;

import cn.itcast.dao.Userdao;
import cn.itcast.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@SuppressWarnings("all")
public class UserdaoImpl implements Userdao {

/*    public UserdaoImpl(String username, int age) {
        this.username = username;
        this.age = age;
    }*/

//    private String username;
//    private int age;

    private List<String> strlist;
    private Map<String, User> usermap;
    private Properties p;

    public List<String> getStrlist() {
        return strlist;
    }

    public void setStrlist(List<String> strlist) {
        this.strlist = strlist;
    }

    public Map<String, User> getUsermap() {
        return usermap;
    }

    public void setUsermap(Map<String, User> usermap) {
        this.usermap = usermap;
    }

    public Properties getP() {
        return p;
    }

    public void setP(Properties p) {
        this.p = p;
    }

    /*    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/

    public UserdaoImpl() {
        System.out.println("构造方法执行了");
    }

/*    public void init() {
        System.out.println("我被初始化了");
    }

    public void destory() {
        System.out.println("我被销毁了");
    }*/

    public void save() {
        System.out.println("dao的save执行了");
//        System.out.println(username + ":" + age);

        System.out.println(strlist);
        System.out.println(usermap);
        System.out.println(p);
    }
}

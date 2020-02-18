package cn.itcast05;

import org.junit.Test;

public class TestJDBC {

    @Test
    public void m1(){
        User aaa = new User("张三", "123");
        User user = UserDao.findUser(aaa);
        System.out.println(user);
    }
}

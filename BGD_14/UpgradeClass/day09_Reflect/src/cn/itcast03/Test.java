package cn.itcast03;

import java.lang.reflect.Constructor;

public class Test {

    public static void main(String[] args) throws Exception {

        Class<User> userClass = User.class;

//        Constructor<User> con = userClass.getDeclaredConstructor();
//
//        User user1 = con.newInstance();
//        System.out.println(user1);

        //通过类的字节码对象.newInstance方法可以实例化一个对象
//        User user = userClass.newInstance();
//        System.out.println(user);

        Constructor<User> userConstructor = userClass.getDeclaredConstructor(String.class, int.class);

//        userConstructor.setAccessible(true);

        User tom = userConstructor.newInstance("tom", 12);
        System.out.println(tom);

//        Class<String> stringClass = String.class;
//
//        Class<Integer> integerClass = int.class;
//
//        User u = new User();
//        Class<? extends User> aClass = u.getClass();
//
//        Class<?> aClass1 = Class.forName("cn.itcast03.User");

        //获取到类的字节码文件对象之后
    }
}

package cn.itcast05;

public class TestUser {

    public static void main(String[] args) {

        User u = new User();

        u.setUsername("张三");
        u.setPassword(123);


        User u1 = new User();

        u1.setUsername("李四");
        u1.setPassword(321);

        u.printMessage();
        u1.printMessage();

//        System.out.println(u);
//        System.out.println(u1);
//
//        u.outputPassword();
//        u1.outputPassword();
    }

}

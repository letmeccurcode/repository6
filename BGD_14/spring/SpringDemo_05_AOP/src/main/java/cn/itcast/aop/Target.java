package cn.itcast.aop;

public class Target implements TargetInterface {

    public void save() {
        System.out.println("save invoke!");
//        System.out.println(10/0);
    }
}

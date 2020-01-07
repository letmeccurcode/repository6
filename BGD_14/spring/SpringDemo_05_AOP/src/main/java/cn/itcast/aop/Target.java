package cn.itcast.aop;

public class Target implements TargetInterface {

    public void save() {
        System.out.println("save invoke!");
    }
}

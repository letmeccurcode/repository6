package cn.itcast.proxy.jdk;

public class Target implements TargetInterface {

    public void save() {
        System.out.println("save invoke!");
    }
}

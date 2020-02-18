package cn.itheima2;

import java.util.ArrayList;

public class MainApp {

    public static void main(String[] args) {

        Manager manager = new Manager("群主", 100);

        Member zs = new Member("张三", 0);
        Member ls = new Member("李四", 0);
        Member ww = new Member("王五", 0);

        manager.show();
        zs.show();
        ls.show();
        ww.show();

        System.out.println("=============");
        ArrayList<Integer> send = manager.send(20, 3);

        zs.receive(send);
        ls.receive(send);
        ww.receive(send);

        manager.show();
        zs.show();
        ls.show();
        ww.show();
    }
}

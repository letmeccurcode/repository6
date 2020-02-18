package cn.itheima2;

import java.util.ArrayList;

public class Manager extends User {

    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int total, int count) {
        ArrayList<Integer> list = new ArrayList<>();

        int leftMoney = super.getMoney();

        if (total > leftMoney) {
            System.out.println("余额不足!");
            return list;
        }
        super.setMoney(leftMoney - total);

        int avg = total / count;
        int mod = total % count;

        for (int i = 0; i < count - 1; i++) {
            list.add(avg);
        }

        list.add(mod + avg);
        return list;
    }
}

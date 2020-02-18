package cn.itheima2;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        Random r = new Random();
        int index = r.nextInt(list.size());
        Integer money = list.remove(index);
        super.setMoney(money + super.getMoney());
    }
}

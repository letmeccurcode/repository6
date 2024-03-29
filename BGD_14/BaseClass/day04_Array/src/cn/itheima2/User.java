package cn.itheima2;

public class User {

    private String name;
    private int money;

    public void show() {
        System.out.println("我叫" + name + ",我有" + money + "元");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }
}

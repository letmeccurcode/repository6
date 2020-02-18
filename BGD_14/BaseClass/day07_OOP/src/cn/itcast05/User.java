package cn.itcast05;

public class User {

    //私有属性
    private String username;
    private int password;

    //提供get/set方法

    public String getUsername() {
        return username;
    }

    //程序使用变量时遵循就近原则 先去局部范围找 找不到 就去成员范围找
    //this可以用来区分同名的成员变量和局部变量
    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    //用来打印用户的姓名和密码
    public void printMessage() {
        System.out.println(this.username + "的密码是:" + this.password);
    }


    public void outputPassword(){
    //        System.out.println(password);
    //        System.out.println(this.password);
        System.out.println(this);

        //this是一个引用类型 保存了当前对象的内存地址 指向该对象自身 每一个被new出来的对象都有一个属于自己的 this 在下
    }
}

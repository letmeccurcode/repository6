package cn.itcast04;

public class Student {

    private String name;//成员变量
    //堆区
    //随着对象的创建而创建 随着对象的消失而消失
    //有默认值

    //对外提供公开的get/set方法
    //无参有返回的方法
    public String getName() {
        return name;
    }

    //有参无返回的方法
    public void setName(String s) {
        name = s;
    }

    public void sleep(int hours) {//局部变量 栈区 随着方法的压栈而产生 随着方法的弹栈而消失 没有默认值
        System.out.println(name + "每天睡" + hours + "个小时");

//        check();
//        System.out.println(name);
        //        int x;
        //        System.out.println(x);
//        System.out.println(hours);
    }

/*    private void check(){
        System.out.println("check 方法已经被调用了!");
    }*/
}

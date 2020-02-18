package cn.itcast01;

import java.util.ArrayList;

public class Demo6 {

    public static void main(String[] args) {

//        1.分析以下需求，并用代码实现：
//        (1)定义一个Worker类型(属性私有、空参有参构造、set、get方法)，
//        包含三个属性：姓名(String name)、年龄(int age)、工资(double salary),在Worker类中定义work方法打印一句话，
//        如："凤姐 正在工作"，其中"凤姐"代表当前对象的姓名
//        (2)定义List集合，在List集合中增加三个员工，基本信息如下：
//        "凤姐" 18 20000
//        "欧阳峰" 60 8000
//        "刘德华" 40 30000
//        (3)在"欧阳峰"之前插入一个员工，信息为：姓名："张柏芝"，年龄：35，工资3300
//                (5)删除"刘德华"的信息
//                (6)利用for 循环遍历，打印List 中所有员工的信息, 对所有的员工调用work 方法

        ArrayList<Worker> list = new ArrayList<>();

        Worker cxk = new Worker("蔡徐坤", 25, 1000.0);
        Worker qbl = new Worker("乔碧萝", 48, 2000.0);
        Worker sxc = new Worker("孙笑川", 28, 1500.0);//挨骂博主
        Worker zbz = new Worker("张柏芝", 46, 2500.0);

        list.add(cxk);
        list.add(qbl);
        list.add(sxc);

//        for (int i = 0; i < list.size(); i++) {
//            Worker w = list.get(i);
//            System.out.println(w.getName() + "," + w.getAge() + "," + w.getSalary());
//        }

        for (int i = 0; i < list.size(); i++) {
            Worker w = list.get(i);
            if (w.getName().equals("乔碧萝")) {
                list.add(i, zbz);
                break;
            }
        }


//        for (int i = 0; i < list.size(); i++) {
//            Worker w = list.get(i);
//            System.out.println(w.getName() + "," + w.getAge() + "," + w.getSalary());
//        }


        for (int i = 0; i < list.size(); i++) {
            Worker w = list.get(i);
            if (w.getName().equals("孙笑川")) {
                list.remove(i);
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            Worker w = list.get(i);
            w.work();
            System.out.println(w.getName() + "," + w.getAge() + "," + w.getSalary());
        }
    }
}

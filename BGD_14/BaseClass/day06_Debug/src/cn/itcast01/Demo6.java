package cn.itcast01;

import java.util.Scanner;

public class Demo6 {

    public static void main(String[] args) {

        /*
            1 编码代码模拟银行取钱的业务
            2 要求录入密码 如果密码错误 允许重新录入 并且给出提示 还有几次机会(假定正确密码是111111)
                但是超过三次 就提示卡被锁定 请联系银行..
            3 如果密码输入正确 请录入取款金额 (必须是大于100 的整数 一次最多一万元)
                如果取款金额录入有误 请允许重新录入
                如果取款金额正确 就输出提示 取款成功 取走xx元!
            4 定义方法来完成
         */

        login();
    }

    /**
     * 模拟登陆银行卡账户取款
     */
    public static void login() {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);

        //提示用户输入密码
        f:
        for (int i = 1; i < 4; i++) {
            System.out.println("请输入您的密码:");
            int password = sc.nextInt();

//            if (password == 111111) {
            if (query(password)) {
                //模拟一个数据库 把用户的密码存入数据库中
                //这是密码正确 登陆成功的情况
                while (true) {//死循环 以防用户输入金额有误 允许重新录入
                    System.out.println("请输入您的取款金额(最少100 最多一万!)");

                    int money = sc.nextInt();

                    if (money % 100 == 0 && money <= 10000) {//判断取款金额是否满足要求
                        System.out.println("取款成功!取走" + money + "$");
                        break f;//结束的是指定的那个for循环
                    } else {
                        System.out.println("输入的金额有误 请重新输入!");
                    }
                }
            } else {
                if (i == 3) {//如果i==3说明最后一次录入密码失败
                    System.out.println("卡被锁定 请联系银行..");
                } else {
                    //说明是第一次/第二次录入密码
                    System.out.println("密码有误!还有" + (3 - i) + "次");
                }

                /*if (i == 3)
                    System.out.println("卡被锁定 请联系银行..");
                else
                    System.out.println("密码有误!还有" + (3 - i) + "次");*/
            }
        }
    }

    /**
     * @param pswd 用户传入的密码
     * @return 判断用户的密码在数据库中是否存在
     * true 存在
     * false 不存在
     */
    public static boolean query(int pswd) {
//        String [] names = {"","","",""};
        int[] pswds = {111111, 123456, 654321, 888888};
        for (int i = 0; i < pswds.length; i++) {
            if (pswd == pswds[i]) {
                return true;
            }
        }
        return false;
    }
}

package cn.itcast01;

import java.util.Scanner;

public class Demo3 {

    public static void main(String[] args) {

//        break 用来结束switch/循环语句
//        return
//        System.exit(0);

//        break; 不能单独使用


//        int i = 1;


        m1();

        System.out.println("44444");
        System.out.println("55555");
    }

    public static void m1() {
        w:
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个数字");

            int i = sc.nextInt();
            switch (i) {
                case 1:
                    System.out.println("11111");
                    break;
                case 2:
                    System.out.println("22222");
                    break;
                default:
                    System.out.println("33333");
//                    break w;
//                    return;//结束当前这个方法
                    System.exit(0);
            }
        }

        // break < return < System.exit(0)
    }
}

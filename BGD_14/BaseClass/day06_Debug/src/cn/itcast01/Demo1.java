package cn.itcast01;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
/*
        System.out.println("请输入行:");
        int row = scanner.nextInt();
        System.out.println("请输入列:");
        int col = scanner.nextInt();
        print(row, col);
*/

        //定义方法的快捷键 alt + enter -> create method in class name
        boolean flag = m1(100);
//        System.out.println(flag);

        m2("hello");
    }

    public static void m2(String s) {
        System.out.println(s);
    }

    public static boolean m1(int i) {

        return i == 10;
    }

    //把一段代码抽取定义成方法 : alt + shift + m
    public static void print(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}

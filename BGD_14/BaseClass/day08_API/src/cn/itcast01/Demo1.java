package cn.itcast01;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入:");

//        String str = sc.nextLine(); 可以接受录入 空格和tab键位符 录入整句话
        String str = sc.next(); //录入单词 词语
        System.out.println(str);
    }
}

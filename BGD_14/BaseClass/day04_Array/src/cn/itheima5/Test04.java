package cn.itheima5;

import java.util.*;

public class Test04 {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int result = r.nextInt(100) + 1;
//        print99();
    }

    public static void print99() {
        for (int x = 1; x <= 9; x++) {//外循环控制行
            for (int y = 1; y <= x; y++) {//内循环控制列
                System.out.print(y + "*" + x + "=" + (x * y)+"\t");
            }
            System.out.println();
        }
    }
}

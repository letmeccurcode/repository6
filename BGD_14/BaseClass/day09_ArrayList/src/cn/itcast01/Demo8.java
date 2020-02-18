package cn.itcast01;

import java.util.Random;

public class Demo8 {

    public static void main(String[] args) {

        Random random = new Random();

        int i = random.nextInt(100)+1;

        //50 - 100
        int num = random.nextInt(51)+50;
    }
}

package cn.itcast01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) throws Exception{


//        FileInputStream fis = new FileInputStream("day07_IO/info.txt");

        FileOutputStream fos = new FileOutputStream("day07_IO/info2.txt");

        byte[] bytes = "中国".getBytes();
        System.out.println(Arrays.toString(bytes));

        fos.write(bytes);

        //如果读写的是同一个文件fis和fos不能同时创建

//        System.out.println(fis.read());
    }
}

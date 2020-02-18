package cn.itcast01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Test04 {

    public static void main(String[] args) throws Exception {

        //使用默认UTF-8写数据

        //a -> 97
        FileOutputStream fos = new FileOutputStream("day07_IO/info.txt");

        fos.write(97);

        byte[] bytes = "中".getBytes();
//        ‭1111111111111111111111111111111111111111111111111111111111100100‬
//        ‭1111111111111111111111111111111111111111111111111111111110111000‬
//        ‭1111111111111111111111111111111111111111111111111111111110101101‬


        System.out.println(Arrays.toString(bytes));

        FileInputStream fis = new FileInputStream("day07_IO/info.txt");

        byte [] bs = new byte[10];
        int i = fis.read(bs);
//        OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream("day07_IO/info.txt"));
        //使用默认UTF-8读数据
//        InputStreamReader is = new InputStreamReader(new FileInputStream("day07_IO/info.txt"));
    }
}

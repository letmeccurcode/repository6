package cn.itcast01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Test02 {

    public static void main(String[] args) throws Exception {

//        OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream("day07_IO/info.txt", true));
        OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream("day07_IO/info.txt"));
//        os.write("hello");

//        os.write(97);
        os.write("中国");

        os.close();
        //转换流 把字节流按照指定编码格式/默认编码格式转换成字符流

//        InputStreamReader is = new InputStreamReader(new FileInputStream("day07_IO/info.txt"));
//        OutputStreamWriter os1 = new OutputStreamWriter(new FileOutputStream("day07_IO/info.txt"), "GBK");
        InputStreamReader is1 = new InputStreamReader(new FileInputStream("day07_IO/info.txt"), "GBK");


//        byte[] bytes = "中国".getBytes("UTF-8");
        byte[] bytes = "中国".getBytes("GBK");
        System.out.println(Arrays.toString(bytes));

//        int i = is.read();
//        int j = is.read();
//        System.out.println(i);
//        System.out.println(j);

        int i = is1.read();
        int j = is1.read();
        System.out.println(i);
        System.out.println(j);

//        os.write("黑马程序员");
//        os.write("霜叶红于二月花");

//        int i;
//        while ((i = is.read()) != -1) {
//            System.out.print((char) i);
//        }

        //使用字符流写数据时记得调用flush方法
//        os.close();
//        is.close();
    }
}

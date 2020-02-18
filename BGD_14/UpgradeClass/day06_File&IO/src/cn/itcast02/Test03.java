package cn.itcast02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test03 {

    public static void main(String[] args) throws Exception {

//        FileInputStream fis = new FileInputStream("day06_File&IO/a.txt");
        FileInputStream fis = new FileInputStream("day06_File&IO/c.txt");

        int i;
        while ((i = fis.read()) != -1) {
            //读一个字节就转换一个字节
            System.out.print((char) i);
        }
        fis.close();
/*        int i = fis.read();
        System.out.print((char) i);

        i = fis.read();
        System.out.print((char) i);
        i = fis.read();
        System.out.print((char) i);
        i = fis.read();
        System.out.print((char) i);
        i = fis.read();
        System.out.print((char) i);
        i = fis.read();
        System.out.print(i);*/


    }
}

package cn.itcast02;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test04 {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("day06_File&IO/d.txt");
//        FileOutputStream fos = new FileOutputStream("day06_File&IO/d.txt");

        byte[] bs = new byte[4];

        int len;

        while ((len = fis.read(bs)) != -1) {
            System.out.print(new String(bs, 0, len));
        }
        //fis.read方法的返回值结果是代表当前读取到的有效字节个数
//        int b = fis.read(bs);
//        System.out.println(new String(bs,0,b));//abcd
//        System.out.println(b);//4
//
//        b = fis.read(bs);
//        System.out.println(new String(bs,0,b));//ebcd
//        System.out.println(b);//1


//        int b;
//        while ((b = fis.read()) != -1) {
//            fos.write(b);
//        }
//        fis.close();
//        fos.close();
    }
}

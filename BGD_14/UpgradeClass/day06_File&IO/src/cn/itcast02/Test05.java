package cn.itcast02;

import java.io.*;

public class Test05 {

    public static void main(String[] args) throws Exception {
//        FileInputStream FileOutputStream 低级流
//        BufferedInputStream  BufferedOutputStream 高级流

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day06_File&IO/c.txt"));

        //带缓冲区的流读写速度会比较快

        byte [] bs = new byte[1024];

        int len;

        while((len = bis.read(bs))!=-1){
            System.out.print(new String(bs,0,len));
        }
        bis.close();
    }
}

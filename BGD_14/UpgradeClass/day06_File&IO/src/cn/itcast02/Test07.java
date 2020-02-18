package cn.itcast02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test07 {

    public static void main(String[] args) throws IOException {

        File file = new File("day06_File&IO/d.txt");
        FileInputStream fis = new FileInputStream(file);
//abc
//        byte[] bs = new byte[2];{99,98}
//        int len;
//
//        while ((len = fis.read(bs)) != -1) {
//
//        }
    }
}

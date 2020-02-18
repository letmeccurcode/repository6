package cn.itcast02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test06 {

    public static void main(String[] args) throws Exception {

//        FileInputStream fis1 = new FileInputStream("day06_File&IO/a.txt");
//        FileInputStream fis2 = new FileInputStream("day06_File&IO\\a.txt");

//        FileInputStream fis3 = new FileInputStream("day05_Map/a.txt");
        FileInputStream fis3 = new FileInputStream("./day05_Map/a.txt");

        File file = new File("./day05_Map/a.txt");
        FileInputStream stream = new FileInputStream(file);
        System.out.println(fis3.read());


    }
}

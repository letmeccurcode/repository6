package cn.itcast02;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {

    //final     final是修饰符 类/方法/变量
    //finally   finally是一个语句块 经常会和try catch一起使用 finally语句块中的代码无论如何一定会执行
    //finalize  finalize是一个方法 如果一个对象没有更多的引用指向它 那么垃圾回收器会调用该对象的finalize方法 已过时 since jdk9

    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            System.out.println(10 / 0);//
            fos = new FileOutputStream("day06_File&IO/c.txt", true);

            fos.write("xyz".getBytes());
            fos.write("\r\n".getBytes());
            fos.write('a');
            fos.write("\r\n".getBytes());
            fos.write("一行白鹭上青天".getBytes());
            fos.write("\r\n".getBytes());
            fos.write("HelloWorld".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

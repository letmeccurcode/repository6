package cn.itcast02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test01 {

    public static void main(String[] args) throws Exception {

        FileOutputStream fos = new FileOutputStream("day06_File&IO/b.txt");

//        fos.write(97);
//        fos.write(48);
//        fos.write('b');

//        String s = "xyzhello";
        String s = "张三今年二十三";
        //UTF-8这种编码是以三个字节表示一个汉字
        byte[] arr = s.getBytes();
        //把字符串 -> 字节数组
        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(chars));
        fos.write(arr,0,6);

        //不管输入流还是输出流使用完毕只有都要记得关闭
        //关闭之后是无法再继续向外写出数据的
        fos.close();
//        fos.write(98);
    }
}

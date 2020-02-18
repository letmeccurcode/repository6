package cn.itcast01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test03 {

    public static void main(String[] args) throws Exception {

        //转换流 把字节流 -> 字符流
        InputStreamReader is = new InputStreamReader(new FileInputStream("day07_IO//Test02.java"));
        OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream("day07_IO//Test03Copy.java"));

        char[] ch = new char[1024];
        int len;

        while ((len = is.read(ch)) != -1) {
            os.write(ch, 0, len);//写出的是有效数据
            os.flush();
        }

        os.close();
        is.close();
    }
}

package cn.itcast03;

import java.io.*;

public class Test {
    public static void main(String[] args) {

        try {
//            m1();
//            m2();
//            m3();
//            m4();
            m5();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //测试原始的文件字节输入/输出流
    public static void m1() throws Exception {
        //封装数据源
        FileInputStream fis = new FileInputStream("day07_IO\\info3.txt");
        //封装目的地
        FileOutputStream fos = new FileOutputStream("day07_IO\\info4.txt");

        //一次读写一个字节数据 效率低 不用!
        /*
        int b;
        while ((b = fis.read())!=-1){
            fos.write(b);
        }
        */

        //一次书写一个字节数组数组 效率比较高 可以使用
        byte[] bs = new byte[1024];

        int len;
        while ((len = fis.read(bs)) != -1) {
            fos.write(bs, 0, len);
        }

        fis.close();
        fos.close();
    }

    //测试带缓冲区的文件字节输入/输出流(必会!最经常使用!)
    public static void m2() throws Exception {

        //封装数据源
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day07_IO\\info3.txt"));
        //封装目的地
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day07_IO\\info5.txt"));
        //一次读写一个字节数据 效率低 不用!
        /*
        int b;
        while ((b = fis.read())!=-1){
            fos.write(b);
        }
        */

        //一次书写一个字节数组数据 效率比较高 建议使用
        byte[] bs = new byte[1024];

        int len;
        while ((len = bis.read(bs)) != -1) {
            bos.write(bs, 0, len);
        }

        bis.close();
        bos.close();
    }

    //测试原始的文件字符输入/输出流
    public static void m3() throws Exception {
        FileReader fr = new FileReader("day07_IO\\info3.txt");
        FileWriter fw = new FileWriter("day07_IO\\info6.txt");

        //一次读写一个char字符数据 效率低
/*      char c;
        while((c = (char) fr.read())!=-1){
            fw.write(c);
            fw.flush();
        }
        */

        //一次读写一个char字符数组的数据 效率高
        char[] ch = new char[1024];
        int len;
        while ((len = fr.read(ch)) != -1) {
            fw.write(ch, 0, len);
            fw.flush();
        }
        fr.close();
        fw.close();
    }

    //测试带缓冲区的文件字符输入输出流(必会!最经常使用!)
    public static void m4() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("day07_IO\\info3.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day07_IO\\info7.txt"));

        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();
    }

    //测试转换流(使用平台默认的字符集UTF-8将字节流-> 字符流)读写文件 (必会!经常使用!)
    public static void m5() throws Exception {
        InputStreamReader is = new InputStreamReader(new FileInputStream("day07_IO\\info3.txt"));
        OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream("day07_IO\\info8.txt"));

        //一次读取一个字符数据
        /*
        int c;
        while ((c = is.read())!=-1){
            os.write(c);
            os.flush();
        }*/

        //一次读取一个字符数组数据

        char[] c = new char[1024];
        int len;

        while ((len = is.read(c)) != -1) {
            os.write(c, 0, len);
            os.flush();
        }
        is.close();
        os.close();
    }
}

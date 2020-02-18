package cn.itcast02;

import java.io.*;

public class Test01 {

    public static void main(String[] args)throws Exception {

        //字符流是用来读取纯文本 不能用来读取视频/音频/图片..
/*        BufferedReader br = new BufferedReader(new FileReader("day07_IO//python.mp4"));

        BufferedWriter bw = new BufferedWriter(new FileWriter("day07_IO//python介绍.mp4"));

        int c;

        while ((c = br.read())!=-1){
            bw.write(c);
            bw.flush();
        }

        bw.close();
        br.close();*/

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day07_IO//python.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day07_IO//python介绍.mp4"));

        int c;
        while ((c = bis.read())!=-1){
            bos.write(c);
            bos.flush();
        }

        bos.close();
        bis.close();
    }
}

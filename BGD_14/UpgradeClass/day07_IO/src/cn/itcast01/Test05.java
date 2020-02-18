package cn.itcast01;

import java.io.*;

public class Test05 {

    public static void main(String[] args) throws Exception{
//
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(""));
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(""));
//        BufferedReader br = new BufferedReader(new FileReader("day07_IO//info.txt"));
//        BufferedWriter bw = new BufferedWriter(new FileWriter("day07_IO//info2.txt"));
//        InputStreamReader is = new InputStreamReader(new FileInputStream(""));
//        OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream(""));

        FileInputStream fis = new FileInputStream("day07_IO//info.txt");
        int i;
        while ((i = fis.read()) !=-1) {
            System.out.println(i);
        }
    }
}

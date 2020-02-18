package cn.itcast;

import java.io.*;
import java.net.Socket;

/*
    客户端：数据来自于文本文件，接收服务器反馈
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.23.39",65432);

        //封装文本文件的数据
        BufferedReader br = new BufferedReader(new FileReader("day09_Reflect\\Test01.java"));
        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line=br.readLine())!=null) {//也是一个阻塞式方法
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

//        System.out.println(22222);

        //自定义结束标记
//        bw.write("886");
//        bw.newLine();
//        bw.flush();

        //public void shutdownOutput​()
        s.shutdownOutput();

        //接收反馈
        System.out.println("EEE");
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClient.readLine(); //等待读取数据 阻塞式方法
        System.out.println("FFF");
        System.out.println("服务器的反馈：" + data);

        //释放资源
        br.close();
        s.close();
    }
}

package cn.itcast02;

import java.util.Vector;

public class Myticket implements Runnable {

    private int num = 100;
    private Object ob = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (ob) {
                if (num > 0) {
                    //窗口1
                    try {
                        Thread.sleep(200);//窗口1 进入阻塞状态 -> 醒来 -> 就绪状态
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + num + "张票");
                    num--;
                }
            }
        }
    }
}

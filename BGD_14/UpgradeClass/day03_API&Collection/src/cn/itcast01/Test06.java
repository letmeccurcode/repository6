package cn.itcast01;

import java.text.SimpleDateFormat;

public class Test06 {

    public static void main(String[] args) {

        m1();

        System.out.println(11111);
    }

    public static void m1() {
        //标准的异常处理方式 try{}catch(异常类名(Exception e)){}
        try {
            int x = 10;
//            System.out.println(x/0);
            int[] arr = {1, 2};

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.parse("1990-12-12");
            System.out.println(arr[9]);
//        }catch (ArithmeticException e){
        } catch (Exception e) {//new ArrayIndexOutofBoundsException
            //catch语句块定义的异常可以是具体的异常类名
            // 也可以是所有异常的父类Exception

            //处理异常 能够把异常的堆栈信息打印在控制台并且让程序继续执行
//            System.out.println("除数不能为0");

            // throw对象 定义在方法体
            // throws类名 定义方法的声明后
            e.printStackTrace();
        }
    }
}

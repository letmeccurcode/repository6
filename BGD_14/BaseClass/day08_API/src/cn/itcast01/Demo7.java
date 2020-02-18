package cn.itcast01;

public class Demo7 {

    public static void main(String[] args) {

//        PrintStream out = System.out;
//        out.println("halo");

//        System.out.println();

        StringBuilder sb = new StringBuilder();

        sb.append(10);

        sb.append('a');
        sb.append(12.34);
        sb.append("helloworld");

        String s = sb.toString();
        System.out.println(sb.reverse());

//        StringBuilder -> String toString()
//        String -> StringBuilder StringBuilder()

        String hello = new StringBuilder("hello").reverse().toString();

        StringBuffer sb1 = new StringBuffer();

//        sb1.append(1).append('a');
//        sb1.reverse().toString();

        //StringBuilder是线程不安全的类 速度快 效率高
        //StringBuffer是线程安全
    }
}

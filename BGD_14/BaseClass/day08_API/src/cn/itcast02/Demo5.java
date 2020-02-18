package cn.itcast02;

public class Demo5 {

    public static void main(String[] args) {

//        分割功能：
//        字符串”aa,bb,cc” -> aa bb cc
        String s1 = "aa,bb,cc";
        String[] arr1 = s1.split(",");
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }

//        字符串”aa.bb.cc” -> aa bb cc
        String s2 = "aa.bb.cc";
        String[] arr2 = s2.split("\\.");
        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);
        }
//        字符串”aa     bb      cc”  -> aa bb cc

        String s3 = "aa      bb            cc dd";
        String[] arr3 = s3.split("\\s+");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

//        字符串”D:\\Itheima\\workspace\\web1\\src”

        String s4 = "D:\\Itheima\\workspace\\web1\\src";
        String[] arr4 = s4.split("\\\\");// \\\\表示\\
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }

//        字符串”halo123java456mysql789python” 把数字替换成*

        String s5 = "halo123java456mysql789python";

//        String s = s5.replaceAll("\\d+", "*");
        String s = s5.replaceAll("\\d+", "");
        System.out.println(s);
    }
}

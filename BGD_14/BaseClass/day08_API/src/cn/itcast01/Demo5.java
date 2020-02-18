package cn.itcast01;

public class Demo5 {

    public static void main(String[] args) {

        String s = "i love java";

        //第一种
        /*byte[] arr1 = s.getBytes();
        for (int i = 0; i < arr1.length; i++) {
            System.out.println((char) arr1[i]);
        }*/

        //第二种
        /*char[] arr2 = s.toCharArray();
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }*/

        //第三种
        /*for (int i= 0;i < s.length();i++){
            System.out.println(s.charAt(i));
        }*/


    }
}


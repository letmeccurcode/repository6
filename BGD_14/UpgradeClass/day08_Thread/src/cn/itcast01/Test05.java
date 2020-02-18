package cn.itcast01;

public class Test05 {

    public static void main(String[] args) {

        String s1 = "123";
        String s2 = "1" + 2 + 3;

        String s3 = "";

        for (int i = 1;i <4;i++){
            s3 += i;
        }

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}

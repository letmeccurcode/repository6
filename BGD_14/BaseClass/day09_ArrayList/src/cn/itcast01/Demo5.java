package cn.itcast01;

/**
 * 定义一个测试类
 */
public class Demo5 {
//    static boolean flag;
    public static void main(String[] args) {

        //聪明的小高斯
        int sum = 0;
        for (int i = 0;i <= 100;i++){

            if (i % 2 != 0){
                sum += i;
            }
        }
        System.out.println(sum);

        int i = 100;
        while(true){
            if (i++ > 100){
                break;
            }
            System.out.println(i);//101
        }


//        System.out.println("flag"+flag);

//        System.out.println("helloworld");

//        String s = null;
//
//        s.length();

//        String str = "abcdefg";
//        String str1 = str.substring(0,2);
//        System.out.println(str);
//        System.out.println(str1);

//        String str1 = "1", str2 = "2";
//        if (str1 == str2) {
//            System.out.println("111");
//        } else if (str1 < str2) {
//            System.out.println("222");
//        } else {
//            System.out.println("333");
//        }


//        System.out.println();

//        StringBuilder

    }

    @Override
    public String toString() {
        return super.toString();
    }

    public byte count(byte b1, byte b2){
        return  (byte)(b1 - b2);
    }

}

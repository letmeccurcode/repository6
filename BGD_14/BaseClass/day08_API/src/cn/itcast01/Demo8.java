package cn.itcast01;

public class Demo8 {

    public static void main(String[] args) {

//        System.out.println(checkString("上海自来水来自海上1"));

        System.out.println("ilovejava".indexOf("python"));
    }

    public static boolean checkString(String s) {
        //ABBA
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            char head = s.charAt(i);//B
            char tail = s.charAt(j);//B
            if (head != tail) {
                return false;
            }
        }
        return true;
    }

}

package cn.itcast02;

public class Demo1 {

    public static void main(String[] args) {


        String regex = "[1-9][0-9]{4,14}";
        System.out.println("0250a6666667".matches(regex));

        String regex2 = "1[35678][0-9]{9}";
        System.out.println("126653696808".matches(regex2));

        /*          1517806580@qq.com
         * 			liuyi@163.com
         * 			linqingxia@126.com
         * 			fengqingyang@sina.com
         * 			fqy@itcast.cn*/
        String regex3 = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}\\.[a-zA-Z_0-9]{2,3}";
        System.out.println("fengqingyang@sina.com".matches(regex3));
    }
}

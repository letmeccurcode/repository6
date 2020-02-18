package cn.itcast02;

public class Demo4 {

    public static void main(String[] args) {

        //校验邮箱
        // 151654654@qq.com
        // wangzhen@163.com
        // liuyan@126.com
        // laowang@itcast.cn
        // lisi1@sina.com
        // lisi2@sina.com

        String[] emails = {"151654654@qq.com", "sjfdlks234", "sjfdl4@google123.com", "wangzhen@163.com", "liuyan@126.com", "laowang@itcast.cn", "lisi@sina.com"};

        // \\w+@\\w{2,6}\\.\\w+

        for (int i = 0; i < emails.length; i++) {
            String email = emails[i];
            boolean flag = checkEmail(email);
            System.out.println(email + (flag ? "是邮箱" : "不是邮箱"));
        }
    }

    public static boolean checkEmail(String email) {
        return email.matches("\\w+@\\w{2,6}\\.\\w+");
    }
}

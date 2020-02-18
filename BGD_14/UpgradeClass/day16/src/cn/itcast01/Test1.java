package cn.itcast01;

public class Test1 {

    public static void main(String[] args) {

    }

    public boolean login(String username, String password) {
//        String sql = "select * from user where username = 'tom' and password = '123'";

        username = "tom";
        password = "123";
        String sql1 = "select * from user where username = '" + username + "' and password = '" + password + "'";
        String sql2 = "select * from user where username = 'tom' and password = '123'";
        //        这是基础班第一天讲的内容 字符串类型是万能类型 和任意变量相加 结果都是字符串
        return false;
    }
}

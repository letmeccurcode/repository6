package cn.itcast02;

public class Demo3 {

    public static void main(String[] args) {

        //判断功能
        //public boolean matches(String regex)
        //分割功能
        //public String[] split(String regex)
        //替换功能
        //public String replaceAll(String regex,String replacement)


        // 匹配功能:
        // 校验手机号
        // 13686958452
        // 13635482457
        // 13584587568
        // 15968548598
        // 18558469354
        // 18563654568

        // 长度固定 11位
        // 不包含非数字字符
        // 第一位1开头
        // 第二位 可以是3/5/8

        String[] arr = {"13266636677767","13686958452","136869y8452", "13635482457", "17666654532", "13584587568", "15968548598", "166556445545", "18558469354", "18563654568"};

        for (int i = 0; i < arr.length; i++) {
            String num = arr[i];
            boolean flag = checkPhoneNumber(num);
//            System.out.println(num + (flag == true ? "是一个手机号" : "不是一个手机号"));
            System.out.println(num + (flag ? "是一个手机号" : "不是一个手机号"));
        }

    }

    /**
     * @param num 手机号
     * @return boolean类型值数值
     */
    public static boolean checkPhoneNumber(String num) {

        String regex = "1[358]\\d{9}";

        boolean flag = num.matches(regex);

        return flag;
    }
}

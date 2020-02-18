package cn.itcast02;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User user1, User user2) {

        // 左边(当前对象) - 右边 升序
        // 右边 - 左边 降序
        String sname1 = user1.getName();
        String sname2 = user2.getName();

        int sage1 = user1.getAge();
        int sage2 = user2.getAge();

        String pswd1 = user1.getPassword();
        String pswd2 = user2.getPassword();

        //如果比较完毕结果为0 说明出现了重复的元素 就不会放入TreeSet集合中
        //tom  4  123
        //tom  4  321
        int num1 = sname1.compareTo(sname2); //num1 = 0
        int num2 = (num1 == 0 ? sage2 - sage1 : num1);//num2 = 0
        int num3 = (num2 == 0 ? pswd1.compareTo(pswd2) : num2);//num3 = -1
        return num3;// -1
    }
}

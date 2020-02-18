package cn.itcast01;

import java.util.ArrayList;
import java.util.Random;

public class Demo7 {

//    2.分析以下需求，并用代码实现：
//  (1)定义List集合，随机生成十个字符串长度为4的字符串放入集合中(包含a-zA-Z0-9)
//	(2)删除集合中包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
//	(3)遍历集合元素并输出

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = generateString();
            list.add(s);
        }

        System.out.println(list);

        System.out.println("----------------------------");

//        [bqsk, c8i6, kEhh, Z4ov, xidi, x9aG, pxVy, ozea, aE8c]
/*        for (int i = 0; i < list.size(); i++) {//i=1
            String str = list.get(i);
            char[] array = str.toCharArray();
            for (int j = 0; j < array.length; j++) {
                char c = array[j];
                if (c >= '0' && c <= '9') {
                    list.remove(i);
//                    i--;
                }
            }
        }*/

        for (int i = list.size() - 1; i >= 0; i--) {
            String str = list.get(i);
            char[] array = str.toCharArray();
            for (int j = 0; j < array.length; j++) {
                char c = array[j];
                if (c >= '0' && c <= '9') {
                    list.remove(i);
                }
            }
        }


        System.out.println(list);
    }

    public static String generateString() {
        StringBuilder sb = new StringBuilder();

        for (char low = 'a', up = 'A'; low <= 'z'; low++, up++) {
            sb.append(low).append(up);
        }

        for (char num = '0'; num <= '9'; num++) {
            sb.append(num);
        }

        String s = sb.toString();

        Random r = new Random();

        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 4; i++) {

            int index = r.nextInt(s.length());
            char c = s.charAt(index);
            sb2.append(c);
        }
//        System.out.println(sb2.toString());
        return sb2.toString();
    }
}

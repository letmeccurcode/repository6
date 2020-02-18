package cn.itcast;

public class Test3 {

    public static void main(String[] args) {

        String[][] arr1 = {{"java", "php", "python"}, {"mysql", "oracle", "plsql", "nosql", "redis"}, {"idea", "eclipse", "pychar"}};

        //遍历二维数组

        for (int i = 0; i < arr1.length; i++) {//负责取出每个一维数组
            String[] strs = arr1[i];
            for (int j = 0; j < strs.length; j++) {//负责遍历每一个一维数组
                String s = strs[j];
                System.out.print(s + "\t");
            }
            System.out.println();
        }
    }
}

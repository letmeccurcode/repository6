package cn.itcast01;

public class Demo7 {

    public static void main(String[] args) {

        //二维数组:可以存放很多一维数组的数组

        //动态初始化:我们给定数组的长度 系统给出数组的默认值
        //语法1   数据类型 [][] 数组名 = new 数据类型[m][n];
        //m -> 代表二维数组中有多少个一维数组
        //n -> 代表每个一维数组的长度
        int[][] arr1 = new int[3][4];

        //语法2   数据类型 [][] 数组名 = new 数据类型[m][];
        // 这种初始化方法中的每一个一维数组长度都是待定的 可以在外面定义好一维数组之后 将其放入二维数组中
        // 这种方式好处就是 每个一维数组的长度都可以自定义
        //m -> 代表二维数组中有多少个一维数组

        int[][] arr2 = new int[3][];//这个二维数组中存放了三个null 数组是引用类型 如果没有给引用类型赋值 默认值null

        int[] little_arr1 = new int[5];
        int[] little_arr2 = new int[2];
        int[] little_arr3 = new int[8];

        //将三个一维数组放入二维数组中 数组名[索引] = 数值;
        arr2[0] = little_arr1;
        arr2[1] = little_arr2;
        arr2[2] = little_arr3;


        //静态初始化:我们给出数组的默认值 系统计算出数组的长度
        //语法1 : 数据类型 [][] 数组名 = new 数据类型[][]{{},{}...};
        int[][] arr3 = new int[][]{{1, 2}, {3, 4, 5, 6}};

        //语法2 : 数据类型 [][] 数组名 = {{},{}...};
        int[][] arr4 = {{8}, {1, 2, 3}, {5, 6, 7, 3}};
        //   0      1              2
        //        arr = {1,2,3} arr[]

        //二维数组的遍历
        for (int i = 0; i < arr4.length; i++) {
            int[] temp = arr4[i];
            for (int j = 0; j < temp.length; j++) {
                int num = temp[j];
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

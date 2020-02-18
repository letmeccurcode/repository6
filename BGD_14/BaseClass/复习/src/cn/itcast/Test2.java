package cn.itcast;

public class Test2 {

    public static void main(String[] args) {
//        二位数组  是特殊的一维数组 里面存放的是一个个的一维数组

//        定义二维数组

//        动态
        int[][] arr1 = new int[3][2];
        int[][] arr2 = new int[3][];

        int[] ar1 = new int[4];
        int[] ar2 = new int[2];
        int[] ar3 = new int[6];
//        数组名[索引] = 初始值;
        arr2[0] = ar1;
        arr2[1] = ar2;
        arr2[2] = ar3;

//        静态
        int[][] arr3 = new int[][]{{1, 2}, {3, 4}, {5, 6}};
        int[][] arr4 = {{4, 5, 6}, {7, 8}};

//        存元素
//        要求:给第二个数组的第二个位置赋值为100

        int[] second = arr1[1];
        second[1] = 100;
//
        arr1[1][1] = 99;
        arr1[0][0] = 88;

//        取元素
//        数据类型 变量名 = 数组名[索引];
        int i = arr4[1][0];
        System.out.println(i);

        int j = arr4[0][2];
        System.out.println(j);
    }
}

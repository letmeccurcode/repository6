package cn.itcast;

public class Test1 {

    public static void main(String[] args) {

//        数据类型 [] 数组名 = 初始值;

//        动态 我们定义数组的长度 程序给出默认值

//        数据类型 [] 数组名 = new 数据类型[长度];
        int[] arr1 = new int[10];
        float[] arr2 = new float[5];
        String[] arr3 = new String[6];

//        静态 我们定义数组存放的默认值 程序计算出数组长度
        int[] arr4 = new int[]{1, 2, 3, 4};
        int[] arr5 = {4, 5, 6, 7};
        String[] arr6 = {"1", "2", "3"};

//        存元素
//        数组名[索引] = 值;
        arr2[1] = 12.34f;

//        取元素
//        数据类型 变量名 = 数组名[索引];
        String str1 = arr3[2];
//        System.out.println(str1);

//      获取数组长度 length属性 int length = 数组名.length;
        int length = arr6.length;
//        System.out.println(length);

//        对数组进行遍历
        for (int i = 0; i < arr6.length; i++) {
            String result = arr6[i];
//            System.out.println(result);
        }

//        数组下标越界异常
//        System.out.println(arr6[9]);

//        int [] arr7 = null;
//        System.out.println(arr7[0]);

//        Random r = null;
//        int i = r.nextInt(100);
    }
}

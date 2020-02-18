package cn.itcast5;

import java.util.Arrays;
import java.util.Calendar;

public class Test2 {

    public static void main(String[] args) {

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        Calendar c3 = Calendar.getInstance();

        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
        System.out.println(c2 == c3);
//        int[] arr = {1, 2, 3, 4, 5};
        int[] arr = {11, 2, 13, 32, 1};

//        int[] newarr1 = Arrays.copyOf(arr, 3);
//        int[] newarr2 = Arrays.copyOf(arr, 10);
//
//        System.out.println(Arrays.toString(newarr1));
//        System.out.println(Arrays.toString(newarr2));

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

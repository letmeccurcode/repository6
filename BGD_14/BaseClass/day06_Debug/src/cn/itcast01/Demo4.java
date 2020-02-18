package cn.itcast01;

public class Demo4 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
            int temp = arr[i];
            if (temp % 10 != 7 && temp % 2 == 0) {
                sum += temp;
            }
        }

    }
}

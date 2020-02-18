package cn.itheima5;

public class Test03 {

    public static void main(String[] args) {

        int x = 5;
        x--;//4
        ++x;//5
        int y = x++ + ++x + --x + x;
        //              5      7     6   6

//        System.out.println(y);

//        break;


        w:for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break w;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

package cn.itcast01;

public class Demo3 {

    public static void main(String[] args) {

        //第1层循环，用于表示鸡翁的范围，初始化表达式的变量定义为 x=0，判断条件是x<=20
        for (int x = 0; x <= 20; x++) {
            //第2层循环，用于表示鸡母的范围，初始化表达式的变量定义为 y=0，判断条件是y<=33
            for (int y = 0; y <= 33; y++) {
                //这个时候，用于表示鸡雏的变量 z = 100 – x – y
                int z = 100 - x - y;

                //判断表达式 z%3==0 和表达式 5*x + 3*y + z/3 = 100 是否同时成立
                if (z % 3 == 0 && 5 * x + 3 * y + z / 3 == 100) {
                    System.out.println(x + "," + y + "," + z);
                }
            }
        }

        for (int x = 0; x <= 20; x++) {
            for (int y = 0; y <= 33; y++) {
                int z = 100 - x - y;
            }
        }

//        int x = 10;
        //自定义代码模板
        //File -> settings -> Editor -> Live templates -> 先创建Group -> 再创建Template

    /*switch (变量){
            case 值1:
                java语句;
                break;
            case 值2:
                java语句;
                break;
            case 值3:
                java语句;
                break;
            default:
                java语句;
                break;
        }*/

    }

    public static void fun1() {

    }

    public static String fun2(int i) {

        return null;
    }
}

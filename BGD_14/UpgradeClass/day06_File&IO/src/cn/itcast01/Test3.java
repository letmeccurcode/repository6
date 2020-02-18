package cn.itcast01;

import java.io.File;

public class Test3 {

    public static void main(String[] args) {

        File srcFile = new File("day06_File&IO/a");

        printFilePath(srcFile);

        //要求必须把方法递归调用执行流程搞清楚!!!
        //递归前两层搞清楚 后面无论多少层都是一样的思路
    }
    //    D:\FolderA\workspace\BGD\BGD_14\BaseClass\day06_File&IO\a
    //    D:\FolderA\workspace\BGD\BGD_14\UpgradeClass\day06_File&IO\a


    public static void printFilePath(File srcFile) {
        File[] files = srcFile.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file.getAbsolutePath());
                } else {
                    printFilePath(file);
                }
            }
        }
    }
}

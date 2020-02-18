package cn.itcast01;

import java.io.File;
import java.io.IOException;

public class Test1 {

    public static void main(String[] args) throws IOException {

        File file1 = new File("D:\\FolderE");

        System.out.println(file1.mkdir());

        File file2 = new File("D:\\FolderF");
        System.out.println(file2.mkdir());

        File file3 = new File("D:\\FolderG\\FolderA");
        System.out.println(file3.mkdirs());

        File file4 = new File(file3,"a.txt");
        System.out.println(file4.createNewFile());

        File file5 = new File("D:\\");
        File[] files = file5.listFiles();
        for (File file : files) {
//            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
        }

        File file6 = new File("day05_Map/a.txt");
        File file7 = new File("day06_File&IO/a/b/c");
        System.out.println(file6.getPath());
        System.out.println(file6.getAbsolutePath());//绝对路径
//        day06_File&IO\a.txt
//        D:\FolderA\workspace\BGD\BGD_14\UpgradeClass\day06_File&IO\a.txt
    }
}

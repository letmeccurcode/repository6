package cn.itcast01;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;

public class Test03 {

    public static void main(String[] args) throws Exception {

        Properties p = new Properties();

        p.setProperty("aaa", "bbb");
        p.store(new FileWriter("day08//db2.properties"), "comments with pics");

//        p.load(new FileReader("day08//db.properties"));
//
//        Set<String> keyset = p.stringPropertyNames();
//
//        for (String key : keyset) {
//            String value = p.getProperty(key);
//            System.out.println(key + ":" + value);
//        }
    }
}

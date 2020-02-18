package cn.itcast01;

public class Demo4 {

    public static void main(String[] args) {
        String s = "I Love java!";
//        char charAt​(int index) 返回指定索引处的 char值。
        char c1 = s.charAt(0);
//        System.out.println(c1);

//        String concat​(String str) 将指定的字符串连接到该字符串的末尾。
        String result = s.concat("and Mysql!");
//        System.out.println(result);

//        boolean contains​(CharSequence s) 当且仅当此字符串包含指定的char值序列时才返回true。
        boolean flag = s.contains("hello");
//        System.out.println(flag);

//        boolean endsWith​(String suffix) 测试此字符串是否以指定的后缀结尾。
        System.out.println(s.endsWith("java"));

//        boolean startsWith​(String prefix) 测试此字符串是否以指定的前缀开头。
        System.out.println(s.startsWith("I"));

//        boolean equals​(Object anObject) 将此字符串与指定对象进行比较。
//        boolean equalsIgnoreCase​(String anotherString) 将此 String与另一个 String比较，忽略案例注意事项。

        String s1 = "zhangsan";
        String s2 = "ZHANGSAN";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

//        byte[] getBytes​() 使用平台的默认字符集将该 String编码为一系列字节，将结果存储到新的字节数组中。
        byte[] bytes = s1.getBytes();
//        for (int i = 0; i < bytes.length; i++) {
//            System.out.print(bytes[i] + "\t");
//        }

//        int indexOf​(int ch) 返回指定字符第一次出现的字符串内的索引。
//        int lastIndexOf​(int ch) 返回指定字符的最后一次出现的字符串中的索引。
//        int index = s1.indexOf('a');
        int index = s1.indexOf(97);
//        System.out.println(index);
//        int indexOf​(String str) 返回指定子字符串第一次出现的字符串内的索引。

        String s3 = "javaandjavaseandjavaee";
//        System.out.println(s3.indexOf("and"));
//        int lastIndexOf​(String str) 返回指定子字符串最后一次出现的字符串中的索引。
//        System.out.println(s3.lastIndexOf("and"));


//        int length​() 返回此字符串的长度。
//        System.out.println(s1.length());

//        String replace​(CharSequence target, CharSequence replacement) 将与字面目标序列匹配的字符串的每个子字符串替换为指定的文字替换序列。

        String s4 = s3.replace("and", "or");
//        System.out.println(s4);

//        String[] split​(String regex) 将此字符串拆分为给定的 regular expression的匹配。

        String[] arr = s3.split("and");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        String s5 = "good good study,day day up";
//        String[] arr = s5.split(" ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        String substring​(int beginIndex) 返回一个字符串，该字符串是此字符串的子字符串。
//        String substring​(int beginIndex, int endIndex) 返回一个字符串，该字符串是此字符串的子字符串。 包左不包右

        //从指定索引出开始截取字符串 包含起始索引字符
        String s6 = s5.substring(4);
//        System.out.println(s6);

//        String s7 = s5.substring(s5.length() - 2);
//        System.out.println(s7);

        String s8 = s5.substring(5, 15);
//        System.out.println(s8);

//        char[] toCharArray​() 将此字符串转换为新的字符数组。
        char[] chars = s5.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            System.out.println(chars[i]);
//        }

//        String toLowerCase​() 使用默认语言环境的规则将此 String所有字符转换为小写。
//        String toString​() 这个对象（已经是一个字符串！）

        String s9 = "HELLOworld";

//        System.out.println(s9.toUpperCase());
//        System.out.println(s9.toLowerCase());

//        String trim​() 返回一个字符串，其值为此字符串，并删除任何前导和尾随空格。
        String s10 = "   i love java    ";
//        System.out.println(s10.trim());
    }
}

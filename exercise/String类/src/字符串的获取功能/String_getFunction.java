package 字符串的获取功能;

public class String_getFunction {
    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(s.length());

        System.out.println(s.charAt(2));

        // 返回指定字符在字符串第一次出现的索引，参数可以是整型、char.
        System.out.println(s.indexOf(97)); // 整型转换为char(ascll码)
        System.out.println(s.indexOf('a'));// 直接输入char字符

        // 返回指定字符串在字符串第一出现的索引
        System.out.println(s.indexOf("cd"));
        System.out.println(s.indexOf("ce")); // 字符必须相邻

        // 从指定位置开始搜索，返回指定字符在字符串中的第一次出现的索引
        System.out.println(s.indexOf('e', 2)); // 输出4, 可以知道索引是固定的，不以fromIndex为参考

        // 从指定位置开始搜索，返回指定字符串在字符串的第一次出现的索引
        System.out.println(s.indexOf("cd", 1)); // 同上

        // 从后向前搜索字符(串)，返回第一次出现的索引
        System.out.println(s.lastIndexOf('e')); // 输出4,可以知道索引不以从哪里开始搜索为参考
        System.out.println(s.lastIndexOf("cd"));
        System.out.println(s.lastIndexOf('e', 5)); // 从指定位置向前搜索
        System.out.println(s.lastIndexOf("cd", 5));

        // 从指定索引开始截取，默认到最后一个元素
        System.out.println(s.substring(3));// 输出defg
        System.out.println(s.substring(3, 5));



    }
}

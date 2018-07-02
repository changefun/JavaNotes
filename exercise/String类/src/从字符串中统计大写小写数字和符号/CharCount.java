package 从字符串中统计大写小写数字和符号;

public class CharCount {
    public static void main(String[] args) {
        Count();
    }

    static void Count() {
        String s = "ABCDabcdefg12345*&#";
        int big_count = 0;
        int small_count = 0;
        int number_count = 0;
        int other_count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                big_count++;
            } else if (c >= 'a' && c <= 'z') {
                small_count++;
            } else if (c >= '0' && c <= '9') {
                number_count++;
            } else {
                other_count++;
            }
        }
        System.out.println("字符串" + s + "中，大写字母" + big_count + "位，小写字母" + small_count + "位， 数字" + number_count + "位, 其他字符" + other_count + "位");

    }
}

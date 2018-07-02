package 字符串的转换功能;

public class StringTransport {
    public static void main(String[] args) {
        Transport();
    }

    static void Transport() {
        String s = "abcdefgABCD";
        byte[] s2 = s.getBytes();
        for (int i = 0; i < s2.length; i++) {
            // System.out.print(s2[i] + " ");
        }

        s = "我是琲";
        byte[] s3 = s.getBytes();
        for (int i = 0; i < s3.length; i++) {
            System.out.print(s3[i] + " ");
            // UTF-8 汉字占3个字节

        }
    }
}

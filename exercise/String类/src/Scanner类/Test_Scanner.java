package Scanner类;

import java.util.Scanner;

public class Test_Scanner {
    public static void main(String args[]) {
        Scanner_get();
    }

    static void Scanner_get(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int i = scanner.nextInt();
        System.out.print("请输入一个字符串：");
        String s = scanner.nextLine();
        System.out.println("i:"+i+",  s:"+s);
    }

}

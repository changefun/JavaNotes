import java.util.Scanner;

public class BranchStructure {
    public static void main(String[] args){
        Test();
    }

    static void Test(){
        /*输入月份，输出季节*/
        Scanner sc = new Scanner(System.in);

        while (true) {

            switch (sc.nextInt()) {
                case 12:
                case 1:
                case 2:
                    System.out.println("冬季");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("春季");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("夏季");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("秋季");
                    break;
                default:
                    System.out.println("请输入1～12月份");
            }
        }
    }
}

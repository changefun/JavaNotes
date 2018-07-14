import java.util.Scanner;
import java.util.Calendar;

public class RunNian{
    public static void main(String[] args){
        System.out.println("请输入年份：");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(method(year)? "是闰年":"是平年");
    }
    
    static boolean method(int year){
        Calendar c = Calendar.getInstance();
        c.set(year, 2, 1);
        c.add(Calendar.DAY_OF_MONTH, -1);
        return c.get(Calendar.DAY_OF_MONTH) == 29;
    }
}

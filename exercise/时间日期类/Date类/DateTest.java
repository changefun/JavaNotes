import java.util.Date;

public class DateTest{
    public static void main(String[] args){
        Date d = new Date();
        System.out.println(d.getTime());
        d.setTime(1000);
        System.out.println(d.getTime());
        
    }
}

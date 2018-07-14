import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormatTest{

    
    public static void main(String[] args){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        System.out.println(sdf.format(d));
        
        Date d2 = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("y-M-d H:m:s");
        System.out.println(sdf2.format(d2));
        
        String timeString = "2008-08-08 08:08:08";
        SimpleDateFormat sdf3 = new SimpleDateFormat("y-M-d H:m:s");
        try{
            Date d3 = sdf3.parse(timeString);
            System.out.println(d3);
        } catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    
    
}

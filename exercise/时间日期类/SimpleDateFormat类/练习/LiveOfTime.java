import java.util.Date;
import java.text.SimpleDateFormat;

public class LiveOfTime{
    public static void main(String[] args){
        //出生时间字符串和现在的时间字符串
        String birthday = "1996-02-24";
        String now = "2018-07-06";
        
        // 根据字符串转换为时间对象
        SimpleDateFormat sdf = new SimpleDateFormat("y-M-d");
        try{
            Date bt = sdf.parse(birthday);
            Date nt = sdf.parse(now);
        // 根据时间对象获取毫秒值
            Long live = (nt.getTime()-bt.getTime()) / 1000 / 60 / 60 / 24 / 365;
            System.out.println(live);
            
        }catch(Exception e){
            // 
        }
        
    }
}

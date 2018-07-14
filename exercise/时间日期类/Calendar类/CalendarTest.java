import java.util.Calendar;

public class CalendarTest{
    public static void main(String[] args){
        
        use3();
    }
    
    // 使用
    static void use(){
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH) + 1);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK) - 1);
    }
    
    static void use2(){
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR, 1);
        c.add(Calendar.MONTH, 2);
        c.add(Calendar.DAY_OF_MONTH, 3);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH) + 1);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK) - 1);
        
    }
    
    static void use3(){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2008);
        c.set(Calendar.MONTH, 2);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH) + 1);
        c.set(2008, 7,8);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH) + 1);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
    }
}

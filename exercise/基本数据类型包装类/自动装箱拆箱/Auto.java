public class Auto{
    public static void main(String[] args){
        // 自动装箱
        Integer i = 100;
        System.out.println(i);
        
        // 自动拆箱
        int i2 = i + 200;
        System.out.println(i2);
        
        // 注意
        Integer i3 = null;
        int i4 = i3 + 20; // NullPointerException
          
    }
}

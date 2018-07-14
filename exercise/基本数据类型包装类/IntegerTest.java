public class IntegerTest{
    public static void main(String[] args){
        Integer i = new Integer(123);
        System.out.println(i);
        
        //Integer i1 = new Integer("a345"); NumberFormatException
        //System.out.println(i1);
        
        // int转String
        String s = new Integer(23).toString();
        System.out.println(s);
        
        String s2 = Integer.toString(333);
        System.out.println(s2);
        
        System.out.println(String.valueOf(333333));
        
        // String转int
        int i2 = new Integer("123222").intValue();
        System.out.println(i2);
        
        int i3 = Integer.parseInt("9999");
        System.out.println(i3);
        
        
    }
}

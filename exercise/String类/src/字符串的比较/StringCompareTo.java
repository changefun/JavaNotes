public class StringCompareTo{
    public static void main(String[] args){
        demo2();
        
    }
    
    static void demo1(){
        /*
           从两个字符串中的第一个字符开始比较，如a和b, a的unicode编码是97,b是98,
         字符串s1调用compareTo()方法即a-b=97-98=-1.
        */
        
        String s1 = "abcd";
        System.out.println(s1.compareTo("bcde")); // -1
        System.out.println("bcde".compareTo(s1)); // 1, 谁调用该方法谁就作为减数 98-97=1
        
        System.out.println("abc".compareTo("abc")); // 0, 第一个字符大家都相等，再比较第二个字符，以此类推
        
        System.out.println("a".compareTo("abbb")); // -3,  第一个字符都是a，但第一个字符串只有一个字符，所以比较结果是两个字符串的长度相减
        
        System.out.println("成".compareTo("功"));
    }
    
    static void demo2(){
        System.out.println("abc".compareToIgnoreCase("Acc"));
    }

}

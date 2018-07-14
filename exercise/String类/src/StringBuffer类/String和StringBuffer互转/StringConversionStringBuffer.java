public class StringConversionStringBuffer{
    public static void main(String[] args){
        // String 转StringBuffer
        String s = "changefun";
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb);
        
        StringBuffer sb2 = new StringBuffer();
        sb2.append(s);
        System.out.println(sb2);
        
        // StringBuffer转String
        StringBuffer sb3 = new StringBuffer("wuchengfeng");
        String s2 = new String(sb3);
        System.out.println(s2);
        
        String s3 = sb3.toString();
        System.out.println(s3);
        
        String s4 = sb3.substring(0, sb3.length());
        System.out.println(s4);
    }
}

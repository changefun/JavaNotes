public class StringBufferFlip{
    public static void main(String[] args){
        System.out.println(flip("abcdefg"));
    }
    
    static String flip(String s){
        StringBuffer sb = new StringBuffer(s);
        /*for (int i = s.length() - 1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        
        return sb.toString();*/
        sb.reverse();
        return sb.toString();
    }
}

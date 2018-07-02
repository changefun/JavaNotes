public class StringFlip{
    public static void main(String[] args){
        System.out.println(flip("abcd"));
    
    }
    
    static String flip(String str){
        String s = "";
        char[] sc = str.toCharArray();
        for (int i = 0; i < sc.length; i++){
            s = sc[i] + s;
        }
        return s;
    }
}

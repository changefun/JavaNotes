public class CountString{
    public static void main(String[] args){
        String bs = "woaiheima,heimaaiwo,wulunheimahebaima,douheimashihaoma";
        String ss = "heima";
        System.out.println(countString(bs, ss));
        
    }
    
    static int countString(String Bstr, String Sstr){
        int firstIndex = 0;
        int Sslength = Sstr.length();
        int count = 0;
        while(Bstr.indexOf(Sstr) != -1){
            firstIndex = Bstr.indexOf(Sstr, firstIndex);
            if (firstIndex != -1){
                count++;
                firstIndex += Sslength;
            }else {
                break;
            }
        }
        return count;
    }
}

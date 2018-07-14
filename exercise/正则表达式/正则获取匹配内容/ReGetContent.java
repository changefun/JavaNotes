import java.util.regex.*;

public class ReGetContent{
    public static void main(String[] args){
        String reg = "1[3865]\\d{9}";
        Pattern p = Pattern.compile(reg);
        String s = "我现在的手机号码是13692600613,曾经使用13138700165";
        Matcher m = p.matcher(s);
        
        while(m.find()){
            System.out.println(m.group());
        }
    }
}

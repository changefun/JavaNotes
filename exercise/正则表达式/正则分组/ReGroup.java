public class ReGroup{
    public static void main(String[] args){
        // 叠词
        String s = "快快乐乐";
        System.out.println(s.matches("(.)\\1(.)\\2"));
        
        // 分组取值
        String s2 = "快快快快乐乐乐";
        System.out.println(s2.replaceAll("(.)\\1+", "$1"));
    }
}

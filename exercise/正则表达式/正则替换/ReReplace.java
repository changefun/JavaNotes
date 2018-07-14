public class ReReplace{
    public static void main(String[] args){
        String s = "change123fun";
        String s2 = s.replaceAll("\\d+", "");
        System.out.println(s2);
    }
}

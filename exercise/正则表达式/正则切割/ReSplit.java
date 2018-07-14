public class ReSplit{
    public static void main(String[] args){
        String target = "changefun.fun";
        String[] result = target.split("\\.");
        for (String s: result){
            System.out.print(s+" ");
        }
        String t2 = "changefun fun";
        String[] result2 = t2.split("\\s");
        for (String s: result2){
            System.out.print(s+" ");
        }
    }
}

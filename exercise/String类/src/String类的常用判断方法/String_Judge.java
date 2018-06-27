package String类的常用判断方法;

public class String_Judge {
    public static void main(String args[]) {

        String s1 = new String("abc");
        System.out.println(s1.equals("abc"));

        System.out.println(s1.equalsIgnoreCase("ABc"));

        System.out.println(s1.contains("e"));

        System.out.println(s1.startsWith("a"));

        System.out.println(s1.endsWith("c"));

        System.out.println(s1.isEmpty());

        System.out.println("".isEmpty());

        // System.out.println(null.isEmpty());

    }


}

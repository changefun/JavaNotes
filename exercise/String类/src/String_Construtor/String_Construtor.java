package String_Construtor;

public class String_Construtor {

    public static void main(String[] args) {
        byte[] barr = {97, 98, 99, 100, 101};
        System.out.println(new String(barr));

        System.out.println(new String(barr, 1, 3));

        char[] carr = {'a', 'b', 'c', 'd'};
        System.out.println(new String(carr, 1, 3));
    }
}

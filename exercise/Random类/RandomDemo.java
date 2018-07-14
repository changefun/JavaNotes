import java.util.Random;

public class RandomDemo{
    public static void main(String[] args){
        demo3();
    }
    
    static void demo1(){
        Random r = new Random();
        for (int i = 0; i < 5; i++){
            System.out.println(r.nextInt());
        }
    }
    
    static void demo2(){
        Random r = new Random(2000);
        for (int i =0; i < 3; i++){
            System.out.println(r.nextInt());
        }
    }
    
    static void demo3(){
        Random r = new Random();
        for (int i = 0; i<3; i++){
            System.out.println(r.nextInt(10)+1);
        }
    }
}

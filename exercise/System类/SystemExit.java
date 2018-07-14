public class SystemExit{
    public static void main(String[] args){
        exit_test();
    }
    
    static void exit_test(){
        for (int i = 0; i < 10; i++){
            System.exit(0);
            System.out.println("mmmm");
        }
    }
}

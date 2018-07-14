public class SystemTM{
    public static void main(String[] args){
        ctm();
    }
    
    static void ctm(){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            System.out.print(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("程序执行时间："+(endTime-startTime));
    }
}

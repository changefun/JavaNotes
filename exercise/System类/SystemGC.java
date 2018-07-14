public class SystemGC{
    public static void main(String[] args){
        gc_test();
    }
    
    // 招呼垃圾回收器
    static void gc_test(){
        for (int i = 0; i<10; i++){
            new GCDEMO();
            System.gc();
           
        }
        
    }
}

class GCDEMO{
    
    public GCDEMO(){
        System.out.println("生成垃圾");
    }
    @Override
    public void finalize(){
        // super.finalize();
        System.out.println("垃圾已回收");
    }
}

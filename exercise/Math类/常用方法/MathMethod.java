public class MathMethod{
    public static void main(String[] args){
        abs_test();
        ceil_test();
        floor_test();
        max_test();
        min_test();
        pow_test();
        random_test();
        round_test();
        sqrt_test();
    }
    
    // 绝对值
    static void abs_test(){
        System.out.println(Math.abs(12));
        System.out.println(Math.abs(-12));
    }
    
    // 天花板数
    static void ceil_test(){
        System.out.println(Math.ceil(12.1));
        System.out.println(Math.ceil(12.99));
    }
    
    // 地板数
    static void floor_test(){
        System.out.println(Math.floor(12.1));
        System.out.println(Math.floor(12.99));
    }
    
    // 最大值
    static void max_test(){
        System.out.println(Math.max(1,5));
    }
    
    // 最小值
    static void min_test(){
        System.out.println(Math.min(1,5));
    }
    
    // 指数运算
    static void pow_test(){
        System.out.println(Math.pow(2,3)); // 2的3次方
        System.out.println(Math.pow(2,7)); 
    }
    
    // 生成0.0到1.0随机数
    static void random_test(){
        System.out.println(Math.random());
        System.out.println(Math.random() * 100); // 0.0到100.0
    }
    
    // 四舍五入
    static void round_test(){
        System.out.println(Math.round(10.4));
        System.out.println(Math.round(10.5));
        
    }
    
    // 开方数
    static void sqrt_test(){
        System.out.println(Math.sqrt(4));
    }
}

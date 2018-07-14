import java.util.ArrayList;
import java.util.Iterator;

public class Demo{
    public static void main(String[] args){
        // demo1();
        demo2();
    }
    
    // 未加泛型
    static void demo1(){
        ArrayList al = new ArrayList();
        al.add(123);
        al.add(true);
        al.add("sss");
        
        Iterator it = al.iterator();
        while(it.hasNext()){
            String s = (String) it.next();
            System.out.println(s);
        }
    }
    
    // 泛型指定接收数据类型
    static void demo2(){
        ArrayList<String> al = new ArrayList<String>();
        al.add("123");
        al.add("222");
        
        Iterator<String> it = al.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}

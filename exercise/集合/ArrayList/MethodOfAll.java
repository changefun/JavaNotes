import java.util.Collection;
import java.util.ArrayList;

public class MethodOfAll{
    public static void main(String[] args){
        // demo1();
        // demo2();
        demo3();
        // demo4();
    }
    
    // addAll()
    static void demo1(){
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        
        Collection c2 = new ArrayList();
        /*c2.add("a");
        c2.add("b");
        c2.add("c");*/
        // c1.add(c2); [a, b, c, [a, b, c]]
        // c1.addAll(c2); // [a, b, c, a, b, c]
        System.out.println(c1.addAll(c2));
        System.out.println(c1);
    }
    
    // removeAll() // 删除两个集合的交集
    static void demo2(){
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("e");
        
        Collection c2 = new ArrayList();
        /*c2.add("a");
        c2.add("b");
        c2.add("c");*/
        c2.add("e");
        c2.add("d");
        
        System.out.println(c1.removeAll(c2));
        System.out.println(c1);
    }
    
    // containsAll()根据传进来的集合元素来检测集合元素是否存在
    static void demo3(){
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        // c1.add("c");
        
        Collection c2 = new ArrayList();
        //c2.add("a");
        //c2.add("b");
        //c2.add("c");
        // c2.add("e");
        
        System.out.println(c1.containsAll(c2));
    }
    
    // 取两个集合的交集，如果交集等于集合1，则false,赋值失败，否则不等于集合1,则为true,并赋交集给集合1
    static void demo4(){
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("e");
        
        Collection c2 = new ArrayList();
        c2.add("a");
        c2.add("b");
        c2.add("c");
        // c2.add("e");
        
        System.out.println(c1.retainAll(c2));
        System.out.println(c1);
        
    }
}

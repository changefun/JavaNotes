import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRepeatElement{
    public static void main(String[] args){
        
        customRepeat();
        
    }
    
    // 自动装箱类或String类对象适用
    static void clearRepeat(){
        ArrayList al = new ArrayList();
        al.add("a");
        al.add("a");
        al.add("b");
        al.add("b");
        al.add("a");
        al.add("c");
        al.add("c");
        
        Iterator it = al.iterator();
        ArrayList result = new ArrayList();
        
        while(it.hasNext()){
            String str = (String) it.next();
            if (!result.contains(str)){
                result.add(str);
            }
        }
        System.out.println(result);
    }
    
    // 自定义类对象使用（重写元素的equals()）
    static void customRepeat(){
        ArrayList al = new ArrayList();
        al.add(new Student("张三", 23));
        al.add(new Student("张三", 23));
        al.add(new Student("李四", 24));
        
        Iterator it = al.iterator();
        ArrayList result = new ArrayList();
        
        while(it.hasNext()){
            Object o = it.next();
            if (!result.contains(o)){
                result.add(o);
            }
        }
        System.out.println(result);
    }
}

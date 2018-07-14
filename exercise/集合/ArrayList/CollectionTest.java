import java.util.Collection;
import java.util.ArrayList;

public class CollectionTest{
    public static void main(String[] args){
        Collection c = new ArrayList();
        c.add(123);
        c.add("123");
        c.add(true);
        c.add(new Student("张三", 23));
        System.out.println(c);
        
        c.remove(true);
        System.out.println(c);
        
        // c.clear();
        //System.out.println(c);
        
        System.out.println(c.contains(true)? "在":"不在");
        System.out.println(c.isEmpty()? "空的":"不为空");
        
        System.out.println(c.size());
    }
    
    
    
}


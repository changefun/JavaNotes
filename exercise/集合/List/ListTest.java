import java.util.ArrayList;
import java.util.List;

public class ListTest{
    public static void main(String[] args){
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add(1, "E");
        System.out.println(list);
        
        Object o = list.remove(1);
        System.out.println(o);
        System.out.println(list);
        
        Object o1 = list.get(1);
        System.out.println(o1);
        
        Object o2 = list.set(1, "B");
        System.out.println(o2);
        System.out.println(list);
    }
}

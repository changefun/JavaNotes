import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class ConcurrentModeification{
    public static void main(String[] args){
        project2();
    }
    
    static void project1(){
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        
        /*Iterator it = list.iterator();
        while(it.hasNext()){
            String str = (String) it.next();
            if ("b".equals(str)){
                list.add("e");  // ConcurrentModificationException
            }
        }*/
        ListIterator lit = list.listIterator();
        while(lit.hasNext()){
            String str = (String) lit.next();
            if ("b".equals(str)){
                lit.add("e");
            }
        }
        System.out.println(list);
    }
    
    static void project2(){
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        
        for (int i = 0; i< list.size(); i++){
            String str = (String) list.get(i);
            if ("b".equals(str)){
                list.add(i, "C");
            }
        }
        System.out.println(list);
    }
}

import java.util.Collection;
import java.util.ArrayList;

public class IterableArrayList{
    public static void main(String[] args){
        // nomal();
        unnomal();
    }
    
    // 基本数据类型元素
    static void nomal(){
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        Object[] o = c.toArray();
        for (int i = 0; i < o.length; i++){
            System.out.println(o[i]);
        }
    }
    
    // 对象为数组元素
    static void unnomal(){
        Collection c = new ArrayList();
        c.add(new Student("张三", 23));
        c.add(new Student("李四", 24));
        c.add(new Student("赵五", 25));
        Object[] o = c.toArray();
        for (int i = 0; i < o.length; i++){
            Student s = (Student) o[i];
            System.out.println(s.getName() + "   " + s.getAge());
        }
    }
}

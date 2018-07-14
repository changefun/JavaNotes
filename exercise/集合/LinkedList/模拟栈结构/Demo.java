import java.util.LinkedList;

public class Demo{
    public static void main(String[] args){
        Stack s = new Stack();
        s.in("a");
        s.in("b");
        s.in("c");
        
        while(!s.isEmpty()){
            System.out.println(s.out());
        }
    }
}

class Stack{

    private LinkedList lkl = new LinkedList();    
    
    public void in(Object o){
        this.lkl.addFirst(o);
    }
    
    public Object out(){
        return this.lkl.removeFirst();
    }
    
    public boolean isEmpty(){
        return this.lkl.isEmpty();
    }
}

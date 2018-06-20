public class Extends {
    public static void main(String[] args){
        B b = new B("B");
    }
}

class A{
    /*public A(){
        System.out.println("我是 A 无参构造方法");
    }*/

    public A(String name){
        System.out.println("我是 A 有参构造方法");
    }
}

class B extends A{
    public B(){
        System.out.println("我是B无参构造方法");
    }

    public B(String name){
        System.out.println("我是B有参构造方法");
    }
}

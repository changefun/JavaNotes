package 内部类.匿名内部类.匿名内部类面试题;

public class AnonymousInner_Test {
    public static void main(String[] args){
        Outer.method().show();
    }
}

interface Inter{
    void show();
}

class Outer {
    public static Inter method(){
        return new Inter(){
            public void  show(){
                System.out.println("helloworld");
            }
        };

    }
}
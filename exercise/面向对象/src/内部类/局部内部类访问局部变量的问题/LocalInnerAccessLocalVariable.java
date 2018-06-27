package 内部类.局部内部类访问局部变量的问题;

public class LocalInnerAccessLocalVariable {
    public static void main(String[] args){
        Outer outer = new Outer();
        outer.localMethod();
    }

}

class Outer{
    public void localMethod(){
        int num = 10;
        class LocalInner{
            public void access(){
                System.out.println(num);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.access();
    }
}

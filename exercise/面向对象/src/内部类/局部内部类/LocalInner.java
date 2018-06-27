package 内部类.局部内部类;

public class LocalInner {

}

class Outer{
    public void localMethod(){
        class LocalInner{
            public void show(){
                System.out.println("局部内部类");
            }
        }
    }

    public void otherMethod(){
        /*localMethod(){
            LocalInner localInner = new LocalInner();

        }*/
    }
}

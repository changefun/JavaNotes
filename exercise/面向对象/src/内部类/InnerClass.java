package 内部类;

public class InnerClass {
    public static void main(String[] args){
        /*A.B i = new A().new B();
        i.innerMethod();*/

        Out o = new Out();
        o.showIn();

    }
}

class A{
    private String name = "外部名成员变量";
    private void outerMethod(){
        System.out.println("外部类成员方法");
        //new B().innerMethod();
    }
    class B{
        private String name = "内部类成员变量";
        public void innerMethod(){
            System.out.println("内部类成员方法");
            outerMethod();

        }
    }
}

/*使用私有内部类*/
class Out{
    private int num = 10;
    private class In{
        private void show(){
            System.out.println(num);
        }
    }

    public void showIn(){
        In i = new In();
        i.show();
    }
}

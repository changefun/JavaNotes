package 内部类.匿名内部类;

public class AnonymousInnerClass {
    public static void main(String[] args){
        B b = new B();
        b.method3();
    }
}

interface InterfaceA {
    public void show1();
    public void show2();
}

abstract class abstractA{
    public abstract void abshow1();
    public void abshow2(){
        System.out.println("abshow2");
    }
}

class C {
    public void cshow(){
        System.out.println("cshow");
    }
}

class B {
    public void method(){
        new InterfaceA(){
            public void show1(){
                System.out.println("show1");
            }

            public void show2(){
                System.out.println("show2");
            }
        }.show1();
    }

    public void method2(){
        new abstractA(){
            public void abshow1(){
                System.out.println("method2 . abshow1");
            }
        }.abshow1();

        new abstractA(){
            public void abshow1(){
                System.out.println("method2 . abshow1");
            }
            public void useabshow2(){
                this.abshow2();
            }
        }.useabshow2();
    }

    public void method3(){
        new C(){
            public void cshow(){
                super.cshow();
            }
        }.cshow();
    }
}

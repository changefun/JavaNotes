package 多态;

public class Polymorphic {
    public static void main(String[] args){
        /*抽象.多态.Animal cat = new 多态.Cat();
        cat.eat();
        cat.run();
        System.out.println(cat.type);
        cat.run();
        ((多态.Cat)cat).work();*/

        /*多态.Product pc = new 多态.PC();
        pc.use();// 相当于Product.use()
        ((多态.PC)pc).use(); // 相当于PC.use()
        System.out.println(pc.name);// 多态.Product.name
        System.out.println(((多态.PC)pc).name);// 多态.PC.name
        ((多态.PC) pc).use();
        多态.PC pc1 = new 多态.PC();
        pc1.use();*/

        X x = new Y();
        x.show();

        Y y = new Z();
        y.show();
    }
}
/*多态*/
class Animal{
    public String type = "动物";
    public void eat(){
        System.out.println("正在吃饭");
    }
    public void run(){
        System.out.println("跑");
    }
}

class Cat extends Animal {
    public String type = "猫";
    public void eat(){
        System.out.println("猫吃饭");
    }
    public void run(int step){
        System.out.println("猫跑了"+ step + "步");
    }

    public void work(){
        System.out.println("捉老鼠");
    }
}

/*多态中静态成员*/

class Product{
    public static String name = "产品";
    public static void use(){
        System.out.println("产品使用");
    }
}

class PC extends Product{
    public static String name = "电脑";
    public static void use(){
        System.out.println("使用电脑");
    }
    public static void use(String size){
        System.out.println("使用"+size+"型号的电脑");
    }
}

/*多态题目*/
class X{
    public void show(){
        this.show2();
    }
    public void show2(){
        System.out.println("我");
    }
}

class Y extends X{
    /* 多态.X 父类的继承下来的方法
    public void show(){
        this.show2();
    }*/
    public void show2(){
        System.out.println("爱");
    }
}


class Z extends Y{
    public void show(){
        super.show();
    }
    public void show2(){
        System.out.println("你");
    }
}
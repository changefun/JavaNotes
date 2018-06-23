package 接口;

public class Interface {
    public static void main(String[] args){
        /*A b = new B();
        b.show();*/

        /*猫狗*/
        JumpCat cat = new JumpCat("Tom", 2);
        cat.eat();
        cat.sleep();
        cat.jump();

    }
}

interface A{
     int num = 1;
     void show();

}

class B implements A{
    public void show(){
        System.out.println(this.num);
    }
}

/*类和接口的关系，接口和接口的关系*/
interface Interf{
    void method();
}

interface Interf2{
    void method2();
}

class Class implements Interf, Interf2{ // 类实现多个接口
    public void method(){}
    public void method2(){}
}

class Class2 extends Class implements Interf, Interf2{  // 类继承一个类同时实现多个接口
    public void method(){}
    public void method2(){}
}

interface Interf3 extends Interf, Interf2{   // 接口继承接口，而且可以多继承

}

// interface Interf4 implements Interf{} 接口不能实现接口

/*抽象类和接口的区别*/
abstract class abclass implements inter{

}
interface inter {
    void show();
}

/*猫狗案例的接口实现*/
abstract class Animal{
    private String name;
    private int age;

    public Animal(){}
    public Animal(String name, int age){
        this.age = age;
        this.name = name;
    }

    public abstract void eat();
    public abstract void sleep();

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

interface Jump{
    public abstract void jump();
}

class Cat extends Animal{

    public Cat(){}
    public Cat(String name, int age){
        super(name, age);
    }
    public void eat(){
        System.out.println(this.getName() + "猫吃饭");
    }
    public void sleep(){
        System.out.println(this.getName() + "猫睡觉");
    }


}

class JumpCat extends Cat implements Jump{

    public JumpCat(){}
    public JumpCat(String name, int age){
        super(name, age);
    }

    public void jump(){
        System.out.println("猫跳高");
    }
}

class Dog extends Animal{

    public Dog(String name, int age){
        super(name, age);
    }

    public void eat(){
        System.out.println(this.getName() + "狗吃饭");
    }
    public void sleep(){
        System.out.println(this.getName() + "狗睡觉");
    }

}
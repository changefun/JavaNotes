package 抽象;

import java.util.Calendar;

public class Abstract {
    public static void main(String[] args){
        /*Animal cat = new Cat();
        cat.eat();*/

        /*A b = new B(123);
        b.run();
        System.out.println(b.age);
        System.out.println(b.name);
        b.run2();*/

        /*Animal2 cat = new Cat2("汤姆", 12);
        cat.eat();
        ((Cat2) cat).catchMouse();

        Animal2 dog = new Dog("阿黄",12);
        dog.eat();
        ((Dog) dog).lookHouse();*/

        Teacher baseteacher = new BaseTeacher("张三",34);
        baseteacher.teach();
        ((BaseTeacher) baseteacher).teachJAVASE();

    }
}

/*抽象类的特点*/
abstract class Animal{
    public abstract void eat();
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }
}

/*抽象类的特性*/
abstract class A{
    /*抽象类可有自己的变量,常量*/
    public int age;
    public final String name = "hello";

    /*不能抽象修饰成员变量*/
    // public abstract String gender = "女";

    public A(int age){
        this.age = age;
    }
    public abstract void run();

    public void run2(){
        System.out.println("快跑");
    }
}
class B extends A{

    public B(int age){
        super(age);
    }

    public void run(){
        System.out.println("跑");
    }

    public void run2(){
        //super.run2();
        System.out.println("瞬间移动");
    }
}

/*抽象_猫狗案例*/

abstract class Animal2{
    public String name;
    public int age;

    public Animal2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void eat();
}

class Cat2 extends Animal2{
    public Cat2(String name, int age){
        super(name, age);
    }

    public void eat(){
        System.out.println(this.name + "猫吃鱼");
    }
    public void catchMouse(){
        System.out.println(this.name +"捉老鼠");
    }
}

class Dog extends Animal2{
    public Dog(String name, int age){
        super(name, age);
    }
    public void eat(){
        System.out.println(this.name+"吃骨头");
    }

    public void lookHouse(){
        System.out.println(this.name+"看家");
    }
}

/*抽象_老师案例*/
abstract class Teacher{
    public String name;
    public int age;

    public Teacher(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Teacher(){
        this("无名氏", 100);
    }

    public abstract void teach();
}

class BaseTeacher extends Teacher{
    public BaseTeacher(String name, int age){
        super(name, age);
    }
    public BaseTeacher(){}

    public void teach(){
        System.out.println(this.name+"讲课");
    }

    public void teachJAVASE(){
        System.out.println(this.name+"讲JAVASE");
    }
}

abstract class Programer{
    private String name;
    private String id;
    private int money;

    public Programer(){}
    public Programer(String name, String id, int money){
        this.id = id;
        this.money = money;
        this.name = name;
    }
    public  void setName(String name){this.name = name;}
    public  void setId(String id){this.id = id;}
    public  void setMoney(int money){this.money = money;}

    public abstract String getId();
    public abstract String getName();
    public abstract int getMoney();
}

class Manager extends Programer{
    private int bonus;

    public Manager(){}
    public Manager(String name, String id, int money, int bonus){
        super(name, id, money);
        this.bonus = bonus;
    }
    public void setBonus(int bonus){
        this.bonus = bonus;
    }
    public void setName(String name){
        super.setName(name);
    }
    public void setId(String id){
        super.setId(id);
    }
    public void setMoney(int money){
        super.setMoney(money);
    }

    public String getName(){
        //return this.name;
        return "";
    }

    public int getMoney(){
        //
        return 2;
    }

    public String getId(){
        //
        return "";
    }
}
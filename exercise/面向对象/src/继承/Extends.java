package 继承;

public class Extends {
    public static void main(String[] args){
        //继承.B b = new 继承.B("继承.B");
        //继承.Zi zi = new 继承.Zi();
        EStudent student1 = new EStudent("张三", 20);
        student1.eay();
        student1.study();
        ETeacher teacher1 = new ETeacher("董军", 34);
        student1.eay();
        teacher1.teach();
    }
}

class A{
    public A(){
        System.out.println("我是 继承.A 无参构造方法");
    }

    public A(String name){
        System.out.println("我是 继承.A 有参构造方法");
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

/*继承第二题*/
class Fu{
    static {
        System.out.println("继承.Fu 的静态代码块");
    }

    {
        System.out.println("继承.Fu 的构造代码块");
    }

    public Fu(){
        System.out.println("继承.Fu 无参构造方法");
    }
}

class Zi extends Fu{
    static {
        System.out.println("继承.Zi 的静态代码块");
    }

    {
        System.out.println("继承.Zi 的构造代码块");
    }

    public Zi(){
        System.out.println("继承.Zi 的无参构造方法");
    }
}

/*方法的重写*/
class father{
    public String getName(){
        System.out.println("父类");
        return "父类";
    }
}

class Son extends father{
    public String getName(){ // 重写父类的方法，必须相同返回类型
        super.getName();
        return "love";
    }
}


/*案例练习，
* 属性:姓名，年龄
* 行为：吃饭
* 老师特有行为：讲课
* 学生特有行为：学习
* */
class PersionT {
    private String name;
    private int age;

    public PersionT(){}
    public PersionT(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void eay(){
        System.out.println("吃饭");
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}

class ETeacher extends PersionT {

    public ETeacher(String name, int age){
        super(name, age);
    }

    public void teach(){
        System.out.println("年龄"+this.getAge() + "岁的"+ this.getName()+"老师正在讲课");
    }

}

class EStudent extends PersionT{

    public EStudent(String name, int age){
        super(name, age);
    }

    public void study(){
        System.out.println("年龄"+this.getAge() + "岁的"+ this.getName()+"学生正在学习");
    }
}
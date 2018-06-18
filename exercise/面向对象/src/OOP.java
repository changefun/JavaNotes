
class Student{
    public String name;

    public void study(){
        System.out.println(this.name+"正在学习");
    }
}

class Teacher{
    public String name;

    public void teach(){
        Student zhangsan = new Student();
        zhangsan.name = "张三";
        System.out.println(this.name+"老师正在教"+zhangsan.name);
    }
}

class MemberVariables{
    public char c;
    public boolean bl;
    public float f;
    public double d;
    public byte b;
    public short s;
    public static long l;

    public void printMvType(){
        System.out.println("byte成员变量默认值："+this.b);
        System.out.println("short成员变量默认值："+this.s);
        System.out.println("booleam成员变量默认值："+this.bl);
        System.out.println("long成员变量默认值："+this.l);
        System.out.println("float成员变量默认值："+this.f);
        System.out.println("double成员变量默认值："+this.d);
        System.out.println("char成员变量默认值："+this.c);
    }

    public void functionVandMv(){
        long l = 123;
        System.out.println(l);
    }
}


class ObjectAsArgument{
    public String name = "李四";

}

public class OOP {

    public static void main(String[] args){
        /*Teacher teacher = new Teacher();
        teacher.name = "董小明";
        teacher.teach();*/
        //Student student = new Student();

        // System.out.println(student);

        /*long l = 123;
        MemberVariables m = new MemberVariables();
        m.functionVandMv();*/

        ObjectAsArgument oaa = new ObjectAsArgument();
        System.out.println(oaa);
        System.out.println(oaa.name);

        changeObject(oaa);
        System.out.println(oaa);
        System.out.println(oaa.name);
    }


    public static void changeObject(ObjectAsArgument oaa){
        oaa.name = "张三";
    }
}

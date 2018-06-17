public class OOP {

    public static void main(String[] args){
        /*Teacher teacher = new Teacher();
        teacher.name = "董小明";
        teacher.teach();*/
        Student student = new Student();

        System.out.println(student);
    }
}

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

package Object_Test.Student;

public class Student {

    private String name;
    private int age;

    public Student(){}
    public Student(String name, int age){
        this.age = age;
        this.name = name;
    }

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

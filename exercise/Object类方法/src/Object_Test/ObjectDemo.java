package Object_Test;

import Object_Test.Student.Student;

public class ObjectDemo {


    public static void main(String[] args) {


        Student student = new Student("张三", 21);
        // System.out.println(student.hashCode());
        Class clazz = student.getClass();
        System.out.println(clazz.getName());


    }
}

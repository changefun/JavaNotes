public class Student{

    private String name;
    private int age;
    
    public Student(){}
    public Student(String name, int age){
        this.name = name;
        this.age = age;
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
    
    @Override
    public String toString(){
        return "{" + this.getClass().getName() + " name=" + this.name + " age=" + this.age+"}";
    }
    
    @Override
    public boolean equals(Object o){
        Student std = (Student)o;
        return (this.name.equals(std.getName()) && this.age == std.getAge());
    }
}

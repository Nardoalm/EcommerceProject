package peopleSystem.entities;

public class Student extends Person{
    private String course;

    public Student(){
        super();
    }

    public Student(String name, int age, String course){
        super(name, age);
        this.course = course;
    }

    public void study(){
        System.out.printf("Estudando o curso %s", course);
    }
}

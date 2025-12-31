package peopleSystem.entities;

public class Teacher extends Person {
    private String subject;

    public Teacher() {
        super();
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void teach() {
        System.out.printf("Ensinando a matéria %s", subject);
    }
}
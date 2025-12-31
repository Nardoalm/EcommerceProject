package peopleSystem.entities;

public class Person {
    private String name;
    private int age;

    public Person(){
        super();
    }

    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public void introduce(){
        System.out.printf("Meu nome é: %s e tenho %d anos", name, age);
    }
}

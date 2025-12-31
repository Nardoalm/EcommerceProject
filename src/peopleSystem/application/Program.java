package peopleSystem.application;

import peopleSystem.entities.Person;
import peopleSystem.entities.Student;
import peopleSystem.entities.Teacher;

public class Program {
    public static void main(String[] args) {
        Person[][] people = new Person[3][3];

        Student student1 = new Student("Leonardo", 16, "Informática");
        Teacher teacher1 = new Teacher("Saulo", 42, "Filosofia");

        people[0][0] = student1;
        people[1][0] = teacher1;

        Person p1 = student1;
        Person p2 = teacher1;

        people[0][1] = p1;
        people[1][1] = p2;

        Person p3 = new Student("Almeida", 23, "Mineração");
        Student student2 = (Student) p3;

        people[2][0] = p3;
        people[0][2] = student2;

        Person p4 = new Teacher("Alline", 34, "História");
        Person p5 = new Person("Amélia", 65);

        people[1][2] = p4;
        people[2][1] = p5;

        if(p4 instanceof Teacher){
            Teacher teacher10 = (Teacher)p4;
        }

        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people[i].length; j++) {
                if (people[i][j] != null) {
                    System.out.print(people[i][j] + " ");
                } else {
                    System.out.print("null ");
                }
            }
            System.out.println();
        }
    }
}

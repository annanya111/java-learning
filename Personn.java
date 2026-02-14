class Person {

    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {

    int roll;

    Student(String name, int roll) {
        super(name);   // calling parent constructor
        this.roll = roll;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}

public class Personn {
    public static void main(String[] args) {

        Student s = new Student("Ananya", 101);
        s.display();
    }
}

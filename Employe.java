class Employee {

    int id;
    String name;
    double salary;

    // Default constructor
    Employee() {
        id = 0;
        name = "Not Assigned";
        salary = 0.0;
    }

    // Constructor with 2 parameters
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.salary = 0.0;
    }

    // Constructor with 3 parameters
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class Employe {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Annanya");
        Employee e3 = new Employee(102, "Rahul", 45000);

        e1.display();
        e2.display();
        e3.display();
    }
}

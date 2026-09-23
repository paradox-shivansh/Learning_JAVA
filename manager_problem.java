class Employee {

    String name;
    double salary;

    // Parameterized constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {

    String department;

    // Parameterized constructor
    Manager(String name, double salary, String department) {

        // Calls Employee's parameterized constructor
        super(name, salary);

        this.department = department;
    }

    // Method overriding
    @Override
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class manager_problem {

    public static void main(String[] args) {

        Manager manager = new Manager(
            "Shivansh",
            75000,
            "Computer Science"
        );

        // Display all details
        manager.displayDetails();

        // Demonstrating inherited members
        System.out.println("\nAccessing inherited members:");
        System.out.println("Name: " + manager.name);
        System.out.println("Salary: " + manager.salary);
    }
}
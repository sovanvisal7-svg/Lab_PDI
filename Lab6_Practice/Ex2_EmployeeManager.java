class Employee {
    protected String name;
    protected double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double calculateBonus() {
        return salary * 0.10;
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.20;
    }
}

class Intern extends Employee {
    Intern(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.05;
    }
}

public class Ex2_EmployeeManager {
    public static void main(String[] args) {
        Employee[] staff = {
            new Employee("Dara", 1000),
            new Manager("Sokha", 2000),
            new Intern("Vanna", 500)
        };

        for (Employee e : staff) {
            System.out.println(e.getClass().getSimpleName() + " " + e.name + " bonus: $" + e.calculateBonus());
        }
    }
}

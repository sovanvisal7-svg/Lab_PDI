package Lab06_Challenges;
class Person {
    protected String name;

    Person(String name) {
        this.name = name;
    }

    void work() {
        System.out.println(name + " is living life.");
    }

    String getRole() {
        return "Person";
    }
}

class Employee extends Person {
    Employee(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is doing office work.");
    }

    @Override
    String getRole() {
        return "Employee";
    }
}

abstract class Teacher extends Employee {
    Teacher(String name) {
        super(name);
    }

    @Override
    abstract void work();     

    @Override
    String getRole() {
        return "Teacher";
    }
}

class MathTeacher extends Teacher {
    MathTeacher(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is teaching algebra and calculus.");
    }

    @Override
    String getRole() {
        return "Math Teacher";
    }
}

class ScienceTeacher extends Teacher {
    ScienceTeacher(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is running a chemistry experiment.");
    }

    @Override
    String getRole() {
        return "Science Teacher";
    }
}

public class Ch9_AcademicRoles {
    public static void main(String[] args) {
        
        Person[] people = {
            new Person("Dara"),
            new Employee("Sokha"),
            new MathTeacher("Mr. Vannak"),
            new ScienceTeacher("Ms. Srey")
        };

        for (Person p : people) {
            System.out.print("[" + p.getRole() + "] ");
            p.work();
        }
    }
}

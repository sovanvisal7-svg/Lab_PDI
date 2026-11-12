package Lab05.Ex4;

public class Exercise4 {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Sokha", "Developer", 800, "IT");
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Position: " + emp.getPosition());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Department: " + emp.getDepartment());

        emp.setSalary(900);
        System.out.println("New salary: " + emp.getSalary());
    }
}

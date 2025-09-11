
public class Employee {
    
    private String name;
    private int id;
    private double salary;

    
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    
    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    
    public static void main(String[] args) {
        Employee emp = new Employee("Rohan", 1, 500000);
        emp.displayEmployee();
    }
}

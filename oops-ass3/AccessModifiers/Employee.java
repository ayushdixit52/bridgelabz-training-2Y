package AccessModifiers;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) { this.salary = salary; }
    public double getSalary() { return salary; }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void display() {
        System.out.println("Manager ID: " + employeeID + ", Dept: " + department + ", Team Size: " + teamSize);
    }
}

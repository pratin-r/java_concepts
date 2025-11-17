package corejava;

class Employee {
    private String name;
    private double salary;

    public Employee() {
        this("John", 10000.0);
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    String getDetails() {
        return "Name: " + this.getName() + ", Salary: " + this.getSalary();
    }
}

// - Extends Employee
class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    String getDetails() {
        return "Name: " + this.getName() + ", Salary: " + this.getSalary() + ", Department: " + this.getDepartment();
    }
}

public class InheritanceWithTypeCasting {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Leon", 100000.50);
        Employee emp2 = new Manager("Ada Wong", 100000.50, "UI/UX Department");
        System.out.println(emp1.getDetails());
        System.out.println(emp2.getDetails());
        // System.out.println(emp2.getDepartment() ; you cannot access since emp2 is of
        // type Employee. if you want to do it, downcast it.
        Manager mg1 = (Manager) emp2;
        System.out.println(mg1.getName() + " " + mg1.getDetails() + " " + mg1.getDepartment());
    }
}
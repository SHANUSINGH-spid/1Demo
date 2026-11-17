class Employee {
    void calculateSalary() {
        System.out.println("Calculating Employee Salary...");
    }
}

class FullTimeEmployee extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Full-Time Employee Salary: 50000");
    }
}

class PartTimeEmployee extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Part-Time Employee Salary: 20000");
    }
}

public class program20 {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();

        e1.calculateSalary();
        e2.calculateSalary();
    }
}

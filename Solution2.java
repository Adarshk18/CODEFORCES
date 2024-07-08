import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Designation: " + designation + ", Salary: " + salary;
    }
}

class Company {
    private String companyName;
    private Employee[] employees;
    private int numEmployees;

    public Company(String companyName, Employee[] employees, int numEmployees) {
        this.companyName = companyName;
        this.employees = employees;
        this.numEmployees = numEmployees;
    }

    public double getAverageSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary / numEmployees;
    }

    public double getMaxSalary() {
        double maxSalary = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    public Employee[] getEmployeesByDesignation(String designation) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getDesignation().equalsIgnoreCase(designation)) {
                result.add(employee);
            }
        }
        return result.toArray(new Employee[0]);
    }
}

public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter company name: ");
        String companyName = in.nextLine();

        System.out.println("Enter number of employees: ");
        int numEmployees = in.nextInt();
        in.nextLine();

        Employee[] employees = new Employee[numEmployees];
        System.out.println("Enter employee details: ");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee "+ (i+1) + ":" );
            System.out.println("Enter employee id: ");
            int id = in.nextInt();
            in.nextLine();

            System.out.println("Enter name: ");
            String name = in.nextLine();

            System.out.println("Enter designation: ");
            String designation = in.nextLine();

            System.out.println("Enter salary: ");
            double salary = in.nextDouble();
            in.nextLine();

            employees[i] = new Employee(id, name, designation, salary);
        }

        Company company = new Company(companyName,employees,numEmployees);
    }

}

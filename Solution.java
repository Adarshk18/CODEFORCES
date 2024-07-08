import java.util.*;

public class Solution {

    public static class Employee {
        private int employeeId;
        private String employeeName;
        private int age;
        private char gender;
        private double salary;

        public Employee(int employeeId, String employeeName, int age, char gender, double salary) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.age = age;
            this.gender = gender;
            this.salary = salary;
        }

        // getters
        public int getEmployeeId() {
            return employeeId;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public int getAge() {
            return age;
        }

        public char getGender() {
            return gender;
        }

        public double getSalary() {
            return salary;
        }

        // setters
        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }

    public static Employee getEmployeeWithSecondLowestSalary(Employee[] employees) {
        if (employees.length < 2) {
            return null;
        }

        Arrays.sort(employees, Comparator.comparingDouble(Employee::getSalary));

        double firstLowest = employees[0].getSalary();
        double secondLowest = Double.MAX_VALUE;
        Employee secondLowestEmployee = null;

        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > firstLowest) {
                secondLowest = employees[i].getSalary();
                secondLowestEmployee = employees[i];
                break;
            }
        }
        return secondLowestEmployee;
    }

    public static int countEmployeesBasedOnAge(Employee[] employees, int age) {
        int cnt = 0;
        for (Employee employee : employees) {
            if (employee.getAge() == age) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < employees.length; i++) {
            int id = in.nextInt();
            in.nextLine();
            String name = in.nextLine();
            char gender = in.next().charAt(0);
            int age = in.nextInt();
            double salary = in.nextDouble();
            employees[i] = new Employee(id, name, age, gender, salary);
        }
        // Calling the methods
        Employee secondLowestSalaryEmployee = getEmployeeWithSecondLowestSalary(employees);
        if (secondLowestSalaryEmployee != null) {
            System.out.println(
                    secondLowestSalaryEmployee.getEmployeeId() + "#" + secondLowestSalaryEmployee.getEmployeeName());
        } else {
            System.out.println("Null");
        }

        int ageToSearch = in.nextInt();
        int count = countEmployeesBasedOnAge(employees, ageToSearch);
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("No employee found for the given age");
        }

        in.close();
    }

}

package day7.pl;

import day7.bean.Employee;
import day7.service.EmployeeService;
import day7.service.EmployeeServiceImpl;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeServiceImpl();
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();
        String scheme = service.findInsuranceScheme(salary, designation);
        Employee emp = new Employee(id, name, salary, designation, scheme);
        service.addEmployee(emp);
        System.out.println("Employee Details: " + emp);
        System.out.println("Insurance Scheme: " + scheme);
        service.findInsuranceScheme(salary, designation);

        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        String empDetails = service.getEmployeeById(empId).toString();
        System.out.println("Employee Details from Service: " + empDetails);
        sc.close();
    }
}


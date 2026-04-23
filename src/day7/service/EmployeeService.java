package day7.service;

import day7.bean.Employee;

public interface EmployeeService {
    void addEmployee(Employee emp);
    Employee getEmployeeById(int id);
    String findInsuranceScheme(int salary, String designation);
}


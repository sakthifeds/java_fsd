package day7.service;

import day7.bean.Employee;
import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {
    private Map<Integer, Employee> employeeMap = new HashMap<>();

    public void addEmployee(Employee emp) {
        employeeMap.put(emp.getId(), emp);
    }

    public Employee getEmployeeById(int id) {
        return employeeMap.get(id);
    }

    public String findInsuranceScheme(int salary, String designation) {
        if (salary >= 40000 && designation.equalsIgnoreCase("Manager")) {
            return "Scheme A";
        } else if (salary >= 20000 && salary < 40000 && designation.equalsIgnoreCase("Programmer")) {
            return "Scheme B";
        } else if (salary >= 5000 && salary < 20000 && designation.equalsIgnoreCase("System Associate")) {
            return "Scheme C";
        } else {
            return "No Scheme";
        }
    }
}


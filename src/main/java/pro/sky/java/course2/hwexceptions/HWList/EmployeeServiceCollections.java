package pro.sky.java.course2.hwexceptions.HWList;


import pro.sky.java.course2.hwexceptions.Employee;

import java.util.Set;

public interface EmployeeServiceCollections {

    Employee addEmployee(String firstName, String lastName);

    Employee removeEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);

    Set<Employee> getAllEmployees();


}

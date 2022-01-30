package pro.sky.java.course2.hwexceptions.HWList;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.hwexceptions.*;

import java.util.HashSet;
import java.util.Set;

@Service
public class EmployeeServiceCollectionsImpl implements EmployeeServiceCollections {
    private Set<Employee> employees = new HashSet<>();

    @Override
    public Employee addEmployee(String firstName, String lastName) {
        Employee addingEmployee = new Employee(firstName, lastName);

        if (employees.contains(addingEmployee)) {
            throw new EmployeeAlreadyExistsException("Employee already exists!");
        }
        employees.add(addingEmployee);
        return addingEmployee;
    }

    @Override
    public Employee removeEmployee(String firstName, String lastName) {
        Employee removingEmployee = new Employee(firstName, lastName);

        if (!employees.remove(removingEmployee)) {
            throw new EmployeeDoesNotExistException("Employee does not exist!");
        }

        return removingEmployee;
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) {
        Employee findingEmployee = new Employee(firstName, lastName);
        if (!employees.contains(findingEmployee)) {
            throw new EmployeeDoesNotExistException("Employee does not exist!");
        }
        return findingEmployee;
    }

    @Override
    public Set<Employee> getAllEmployees() {
        return employees;
    }
}

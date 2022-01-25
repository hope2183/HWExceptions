package pro.sky.java.course2.hwexceptions;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final Employee[] employees = new Employee[3];
    private int size;

    @Override
    public String addEmployee(String firstName, String lastName) {
        if (employees.length == size) {
            throw new EmployeeArrayIsFullException("Employee array is full!");
        }
        Employee addingEmployee = new Employee(firstName, lastName);
        int addingEmployeeIndex = getEmployeeIndex(addingEmployee);
        if (addingEmployeeIndex != -1) {
            throw new EmployeeAlreadyExistsException("Employee already exists!");
        }

        employees[size++] = addingEmployee;
        return "Employee "+addingEmployee+" successfully added.";
    }

    @Override
    public String removeEmployee(String firstName, String lastName) {
        Employee removingEmployee = new Employee(firstName, lastName);
        int employeeIndex = getEmployeeIndex(removingEmployee);
        if (employeeIndex == -1) {
            throw new EmployeeDoesNotExistException("Employee does not exist!");
        }
        Employee removedEmployee = employees[employeeIndex];
        System.arraycopy(employees, employeeIndex + 1, employees, employeeIndex, size - employeeIndex);
        size--;
        return "Employee "+removedEmployee+" removed successfully.";
    }

    private int getEmployeeIndex(Employee employee) {
        for (int i = 0; i < size; i++) {
            if(employee.equals(employees[i])) ;

            return i;
        }
        return -1;
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) {
        Employee findingEmployee = new Employee(firstName, lastName);
        int employeeIndex = getEmployeeIndex(findingEmployee);
        if (employeeIndex == -1) {
            throw new EmployeeDoesNotExistException("Employee does not exist!");
        }
        return employees[employeeIndex];
    }
}

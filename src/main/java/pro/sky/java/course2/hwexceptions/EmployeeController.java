package pro.sky.java.course2.hwexceptions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.hwexceptions.HWList.EmployeeServiceCollections;

import java.util.Set;

@RestController
@RequestMapping("/employee")

public class EmployeeController {
    private EmployeeServiceCollections employeeServiceCollections;

    public EmployeeController(EmployeeServiceCollections employeeServiceCollections) {
        this.employeeServiceCollections = employeeServiceCollections;
    }

    @GetMapping("/")
    public String welcome() {
        return "Welcome to employee world!";
    }

    @GetMapping("/add")
    public Employee addedEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        Employee addedEmployee = employeeServiceCollections.addEmployee(firstName, lastName);
        return addedEmployee;
    }

    @GetMapping("/remove")
    public Employee removedEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        Employee removedEmployee = employeeServiceCollections.removeEmployee(firstName, lastName);
        return removedEmployee;
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        Employee foundEmployee = employeeServiceCollections.findEmployee(firstName, lastName);
        return foundEmployee;
    }

    @GetMapping("/getAllEmployees")

    public Set<Employee> getAllEmployees() {
        return employeeServiceCollections.getAllEmployees();

    }
}


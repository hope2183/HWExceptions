package pro.sky.java.course2.hwexceptions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")

public class EmployeeController {
    private EmployeeService employeeService;

        public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping ("/")
        public String welcome(){
            return "Welcome to employee world!";
        }
        @GetMapping("/add")
        public Employee addedEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName){
            Employee addedEmployee = employeeService.addEmployee(firstName,lastName);
            return addedEmployee;
        }
    @GetMapping("/remove")
    public Employee removedEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName){
        Employee removedEmployee = employeeService.removeEmployee(firstName,lastName);
        return removedEmployee;
    }
    @GetMapping("/find")
    public Employee findEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName){
        Employee foundEmployee = employeeService.findEmployee(firstName,lastName);
        return foundEmployee;
    }
}

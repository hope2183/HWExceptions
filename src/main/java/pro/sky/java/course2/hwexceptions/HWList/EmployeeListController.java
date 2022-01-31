package pro.sky.java.course2.hwexceptions.HWList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee-list")

public class EmployeeListController {
    private final EmployeeListService employeeListService;

    public EmployeeListController(EmployeeListService employeeListService) {
        this.employeeListService = employeeListService;
    }


    @GetMapping("/employee-list/")
    public String welcome() {
        return "Welcome to employee world!";
    }

    @GetMapping("/add")
    public boolean addToEmployeeList(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        return employeeListService.addToEmployeeList(firstName, lastName);
    }

    @GetMapping("/remove")
    public boolean removeFromEmployeeList(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        return employeeListService.removeFromEmployeeList(firstName,lastName);
    }


    @GetMapping("/find")
    public boolean findInEmployeeList(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        return employeeListService.findInEmployeeList(firstName,lastName);
    }
    @GetMapping("/printList")
    public List<String>getEmployeeList(){
        return employeeListService.getEmployeeList();
    }

}

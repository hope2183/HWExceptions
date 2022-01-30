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
    public boolean removeFromEmployeeList(@RequestParam("index") int index) {
        return employeeListService.removeFromEmployeeList(index);
    }


    @GetMapping("/find")
    public boolean findInEmployeeList(@RequestParam("index") int index) {
        return employeeListService.findInEmployeeList(index);
    }
    @GetMapping("/printList")
    public List<String>getEmployeeList(){
        return employeeListService.getEmployeeList();
    }

}

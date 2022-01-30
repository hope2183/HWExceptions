package pro.sky.java.course2.hwexceptions.HWList;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/employee")
//
//public class EmployeeListController {
//    private final EmployeeListService employeeListService;
//
//    public EmployeeListController(EmployeeListService employeeListService) {
//        this.employeeListService = employeeListService;
//    }
//
//
//    @GetMapping("/employee-list/")
//    public String welcome() {
//        return "Welcome to employee world!";
//    }
//
//    @GetMapping("/add/employee-list/")
//    public boolean addToEmployeeList(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
//        return employeeListService.addToEmployeeList(firstName, lastName);
//    }
//
//    @GetMapping("/remove/employee-list/")
//    public boolean removeFromEmployeeList(@RequestParam("index") int index) {
//        return employeeListService.removeFromEmployeeList(index);
//    }
//
//
////    @GetMapping("/find/employee-list/")
////    public boolean findInEmployeeList(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
////        return employeeListService.findInEmployeeList(firstName, lastName);
////    }
//    @GetMapping("/print/employee-list")
//    public List<String>getEmployeeList(){
//        return employeeListService.getEmployeeList();
//    }
//
//}

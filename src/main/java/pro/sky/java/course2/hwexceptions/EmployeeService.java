package pro.sky.java.course2.hwexceptions;

public interface EmployeeService {
    String addEmployee(String firstName, String lastName);

    Employee removeEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);

}

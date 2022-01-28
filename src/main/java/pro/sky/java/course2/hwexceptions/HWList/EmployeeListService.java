package pro.sky.java.course2.hwexceptions.HWList;

import java.util.List;

public interface EmployeeListService {

    boolean addToEmployeeList (String firstName, String lastName);
    boolean removeFromEmployeeList (int index);
    //boolean findInEmployeeList (String firstName, String lastName);
    List<String> getEmployeeList();

}

package pro.sky.java.course2.hwexceptions.HWList;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class EmployeeListServiceImpl implements EmployeeListService{
    List<String>employeeList;
    public EmployeeListServiceImpl(){
        employeeList=new ArrayList<>();
    }

    @Override
    public boolean addToEmployeeList(String firstName, String lastName) {
                String newEmployee = firstName+lastName;
        return employeeList.add(newEmployee);
    }

    @Override
    public boolean removeFromEmployeeList(int index) {
        String deletedEmployee = employeeList.remove(index);
        return deletedEmployee != null;
    }

    @Override
    public boolean findInEmployeeList(int index) {
        String foundEmployee = employeeList.get( index);
        return foundEmployee!=null;
    }

    @Override
    public List<String> getEmployeeList() {
        return employeeList;
    }
}

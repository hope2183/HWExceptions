package pro.sky.java.course2.hwexceptions.HWList;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.hwexceptions.EmployeeDoesNotExistException;

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

        if (index <= employeeList.size()-1) {
            String deletedEmployee = employeeList.remove(index);
            return deletedEmployee != null;
        }
        throw new EmployeeDoesNotExistException("Employee does not exist!");
    }


    @Override
    public boolean findInEmployeeList(int index) {
        if (index <= employeeList.size() - 1) {
            String foundEmployee = employeeList.get(index);
            return foundEmployee != null;
        }
        throw new EmployeeDoesNotExistException("Employee does not exist!");
    }

    @Override
    public List<String> getEmployeeList() {
        return employeeList;
    }
}

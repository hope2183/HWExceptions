package pro.sky.java.course2.hwexceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeDoesNotExistException extends RuntimeException {
    public EmployeeDoesNotExistException(String message) {
        super(message);
    }
}

package tech.getarrays.employeemanager.exception;

public class UserNotFoundExeception extends  RuntimeException {
    public UserNotFoundExeception(String message) {
        super(message);
    }
}

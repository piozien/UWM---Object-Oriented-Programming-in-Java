package user.managment;

public interface UserValidator {
    abstract boolean validateUser(String userId);
    abstract boolean isAdult(int age);
}

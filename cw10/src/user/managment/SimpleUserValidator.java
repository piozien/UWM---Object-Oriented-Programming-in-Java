package user.managment;

public class SimpleUserValidator implements UserValidator{

    @Override
    public boolean validateUser(String userId) {
        try {
            if (userId != null && !userId.isEmpty()) {
                if (Integer.parseInt(userId) >= 100) {
                    return true;
                }
                return false;
            }
        } catch(NumberFormatException e) {
            return false;
        }
        return false;
    }

    @Override
    public boolean isAdult(int age) {
       if(age >= 18){
           return true;
       }
       return false;
    }
}

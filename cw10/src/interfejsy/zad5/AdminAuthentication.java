package interfejsy.zad5;

public class AdminAuthentication implements Authentication{

    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public void logout() {

    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if(!newPassword.isEmpty()){
            return true;
        }
        return false;
    }
}

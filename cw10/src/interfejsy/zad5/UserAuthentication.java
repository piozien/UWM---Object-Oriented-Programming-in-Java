package interfejsy.zad5;

public class UserAuthentication implements Authentication{
    @Override
    public boolean login(String username, String password) {
        if(username.startsWith("u") && !password.isEmpty()){
            return true;
        }
        return false;
    }

    @Override
    public void logout() {
        System.out.println("Logged out successfully.");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if(oldPassword != newPassword){
            return true;
        }
        return false;
    }
}

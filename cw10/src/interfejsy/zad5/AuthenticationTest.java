package interfejsy.zad5;

public class AuthenticationTest {
    public static void main(String[] args) {
        UserAuthentication u1 = new UserAuthentication();
        System.out.println(u1.login("user", "nfjnse"));
        System.out.println(u1.resetPassword("user", "nfjsfaw", "2y47"));
        u1.logout();
        System.out.println(u1.login("admin", "yrqiwhafak"));
        AdminAuthentication a1 = new AdminAuthentication();
        System.out.println(a1.resetPassword("admin","123","123"));
    }
}

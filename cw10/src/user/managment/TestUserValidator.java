package user.managment;

public class TestUserValidator {
    public static void main(String[] args) {
        SimpleUserValidator s1 = new SimpleUserValidator();
        System.out.println("user s1 id: " + s1.validateUser("1245"));
        System.out.println("user s1 isAdult: " + s1.isAdult(18));
        SimpleUserValidator s2 = new SimpleUserValidator();
        System.out.println("user s2 id: " + s2.validateUser(null));
        System.out.println("user s2 isAdult: " + s2.isAdult(17));
        SimpleUserValidator s3 = new SimpleUserValidator();
        System.out.println("user s3 id: " + s3.validateUser("123tr"));
        System.out.println("user s3 isAdult: " + s3.isAdult(50));

    }
}

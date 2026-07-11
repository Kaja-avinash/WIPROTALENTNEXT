public class Test {

    public static void main(String[] args) {

        UserRegistration user = new UserRegistration();

        try {

            // Example 1 (Outside India)
//          user.registerUser("Mickey", "US");

            // Example 2 (India)
            user.registerUser("Pim", "India");

        }
        catch (InvalidCountryException e) {

            System.out.println(e.getMessage());

        }

    }

}
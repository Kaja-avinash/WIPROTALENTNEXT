public class UserRegistration {

    public void registerUser(String username, String userCountry)
            throws InvalidCountryException {

        if (!userCountry.equalsIgnoreCase("India")) {

            throw new InvalidCountryException(
                    "User Outside India cannot be registered");

        }

        System.out.println("User registration done successfully");

    }

}
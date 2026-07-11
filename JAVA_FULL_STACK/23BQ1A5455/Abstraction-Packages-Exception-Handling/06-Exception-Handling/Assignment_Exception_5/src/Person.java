public class Person {

    public static void main(String[] args) {

        try {

            if (args.length != 2) {
                System.out.println("Usage: java Person <Name> <Age>");
                return;
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age <= 18 || age >= 60) {
                throw new InvalidAgeException(
                        "Age should be greater than 18 and less than 60");
            }

            System.out.println("Name : " + name);
            System.out.println("Age  : " + age);
            System.out.println("Age is valid.");

        }
        catch (NumberFormatException e) {

            System.out.println("Age must be a valid integer.");

        }
        catch (InvalidAgeException e) {

            System.out.println(e.getMessage());

        }

    }

}
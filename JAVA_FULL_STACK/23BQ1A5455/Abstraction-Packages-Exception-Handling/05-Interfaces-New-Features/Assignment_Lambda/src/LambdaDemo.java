public class LambdaDemo {

    public static void main(String[] args) {

        Test t1;
        Test t2;

        // Lambda for Addition
        t1 = (a, b, c) -> a + b + c;

        // Lambda for Multiplication
        t2 = (a, b, c) -> a * b * c;

        int sum = t1.myFunction(10, 20, 30);
        int product = t2.myFunction(10, 20, 30);

        System.out.println("Addition = " + sum);
        System.out.println("Multiplication = " + product);

    }

}
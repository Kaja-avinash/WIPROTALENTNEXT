public class FactorialDemo {

    public int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {

            fact *= i;

        }

        return fact;

    }

    public static void main(String[] args) {

        FactorialDemo obj = new FactorialDemo();

        Factorial f = obj::factorial;

        System.out.println("Factorial = " + f.calculate(5));

    }

}
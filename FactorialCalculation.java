import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int num = sc.nextInt();

        if (num < 0 || num > 20) {
            System.out.println("Enter a number between 0 and 20.");
        } else {
            long factorial = 1;

            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            System.out.println("Factorial: " + factorial);
        }

        sc.close();
    }
}

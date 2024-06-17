import java.util.Scanner;

public class SubtractProductAndSumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int ans1 = 0;
        int ans2 = 1;
        while (n > 0) {
            int rem = n % 10;
            ans1 = ans1 + rem;
            ans2 = ans2 * rem;
            n = n / 10;
        }
        System.out.println("Sum: " + ans1);
        System.out.println("Product:" + ans2);
        System.out.println("Result will be: " + (ans2 - ans1));

    }
}
import java.util.Scanner;

public class BonusQue1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int n = in.nextInt();
        int sumNegative = 0;
        int sumOdd = 0;
        int sumEven = 0;

        while (n != 0) {
            n = in.nextInt();
            if (n < 0) {
                sumNegative += n;
            } else if (n >= 0 && n % 2 == 0) {
                sumEven += n;
            } else {
                sumOdd += n;
            }
        }
        System.out.println("Sum of All negative numbers: " + sumNegative);
        System.out.println("Sum of All positive odd numbers: " + sumOdd);
        System.out.println("Sum of All positive even numbers: " + sumEven);

        in.close();
    }

}

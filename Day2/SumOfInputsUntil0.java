import java.util.Scanner;

public class SumOfInputsUntil0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n;
            System.out.println("Sum = " + sum);
            n = in.nextInt();

        }
        System.out.println("Final Sum = " + sum);

    }

}

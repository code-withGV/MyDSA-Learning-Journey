import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int ans = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            ans = ans + (int) Math.pow(digit, 3);
            temp = temp / 10;

        }
        System.out.println(ans);

    }

}

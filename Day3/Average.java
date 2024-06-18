import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sum = 0;
        int a;
        for (int i = 1; i <= n; i++) {
            a = in.nextInt();
            sum += a;
        }

        System.out.println(sum / n);
        in.close();

    }
}

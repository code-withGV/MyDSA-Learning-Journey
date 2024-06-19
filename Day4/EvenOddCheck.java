import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = in.nextInt();
        boolean check = evenOddCheck(n);
        System.out.println(check);
        in.close();

    }

    static boolean evenOddCheck(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

}

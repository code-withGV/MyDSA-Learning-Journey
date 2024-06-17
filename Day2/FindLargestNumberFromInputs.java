import java.util.Scanner;

public class FindLargestNumberFromInputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int temp = 0;
        while (n != 0) {
            n = in.nextInt();
            if (n > temp) {
                temp = n;
            }

        }
        System.out.println("Final Largest = " + temp);

    }

}

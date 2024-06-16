import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter a string to check: ");
        s = sc.nextLine();
        int i, j, flag;
        i = 0;
        j = s.length() - 1;
        flag = 0;

        while (i < j && flag == 0) {
            if (s.charAt(i) != s.charAt(j)) {
                flag = 1;
            }
            i = i + 1;
            j = j - 1;

        }
        if (flag == 0) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}

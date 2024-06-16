import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount in rupees: ");
        double Amt = sc.nextDouble();

        double USD = Amt / 83.5664;
        System.out.println("amount in Dollar will be " + USD + " USD");
    }

}

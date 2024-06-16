import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double P = in.nextDouble();
        System.out.println("Enter Rate of interest in % per annum: ");
        double R = in.nextDouble();
        System.out.println("Enter Time(yrs): ");
        double T = in.nextDouble();

        double SI = (P * R * T) / 100;
        System.out.println("Simple Interest calculated as: " + SI);
    }

}

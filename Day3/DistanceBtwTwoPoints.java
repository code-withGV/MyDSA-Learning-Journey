import java.util.Scanner;

public class DistanceBtwTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = Math.sqrt((y2 - y1) + (x2 - x1));
        System.out.println("Distance between " + "(" + x1 + "," + y1 + ")" + " And " + "(" + x2 + "," + y2 + ")"
                + " is: " + distance);

        sc.close();
    }

}

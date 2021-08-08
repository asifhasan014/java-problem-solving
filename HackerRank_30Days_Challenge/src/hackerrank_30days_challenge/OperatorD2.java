package hackerrank_30days_challenge;

import java.util.Scanner;

public class OperatorD2 {

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = 0.0;
        double tax = 0.0;
        int totalCost;

        tip = meal_cost * tip_percent / 100;
        tax = meal_cost * tax_percent / 100;

        totalCost = (int) Math.round(meal_cost + tip + tax);

        System.out.println(totalCost);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your meal cost");
        double meal_cost = scanner.nextDouble();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Enter your tip_percent");
        int tip_percent = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Enter your tax_percent");
        int tax_percent = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}

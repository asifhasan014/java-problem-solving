package hackerrank_30days_challenge;

import java.util.Scanner;

public class ConditionalStatementsD3 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N%2==0){
            if(N>=2&&N<=5){
                System.out.println("Not Weird");
            }
            if(N>=6&&N<=20){
                System.out.println("Weird");
            }
            if(N>20){
                System.out.println("Not Weird");
            }
        }else{
            System.out.println("Weird");
        }

        scanner.close();
    }
}

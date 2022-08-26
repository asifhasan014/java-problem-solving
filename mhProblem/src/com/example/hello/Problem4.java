package com.example.hello;

import java.util.Scanner;

public class Problem4 {
    public static void main( String[] args ) {
        boolean condition = true;
        while (condition) {
            System.out.println("Enter your integer number..");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            System.out.println("My solution....");
            String returnVal = check(n);
            int returnValInt = Integer.valueOf(returnVal);
//            System.out.println("Moharishi solution ...");
//            int returnValInt = moharisiSolution(n);

            System.out.println("your revers number : " + returnValInt);
            System.out.println("**************** the end *********************");
            System.out.println("Do you want execute it again? then press 1 if no then press 0");
            int rerunProgram = sc.nextInt();

            if (rerunProgram == 0){
                condition = false;
            }
        }
    }
    private static int moharisiSolution(int n)
    {
        int sign = 1;
        if (n == 0) {
            return 0;
        }
        if (n < 0)
        {
            sign = -1;
            n = -n;
        }
        int reverse = 0;
        while (n != 0)
        {
            reverse = (reverse * 10) + (n % 10);
            n /= 10;
        }
        return sign * reverse;
    }

    private static String check( int n ) {
        if ( n == 1 ) {
            return String.valueOf(n);
        } else {
            int val = n;
            if(n==0){
                return String.valueOf(0);
            }
            if ( val<0 ){
                val = Math.abs(n);
            }
            int division = (int) Math.floor(val / 10);
            int moodVal = val % 10;
            String s = String.valueOf(moodVal) + check(division);
            if(n<0){
                s = "-"+ s;
            }
            return s;
        }
    }

}

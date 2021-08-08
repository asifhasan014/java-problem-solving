package alljavaacmproblems;

import java.util.Scanner;

public class Recursion2DArrayPrblm {

    //static int n = 3;

    static int RecursiomSum(int[][] A, int i, int j) {
        //int sum = 0;
        if (i < 0 && j < 0) {
            //System.out.println("If statement active");
            return 0;
        } else {
            //System.out.println("else active");
            return A[i][j]+RecursiomSum(A, i - 1, j - 1);
            //System.out.println("sum value:"+sum);
        }

    }

    public static void main(String[] args) {
        int i, j;
        int sum;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of array");
        n = input.nextInt();
        int[][] A = new int[n][n];

        System.out.println("Enter the array element");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("Array value is:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(A[i][j]);
            }
            System.out.println("");
        }
        i = n - 1;
        j = n - 1;
        sum=RecursiomSum(A, i, j);
        System.out.println("diagonals sumation is :");
        System.out.println(sum);

    }

}

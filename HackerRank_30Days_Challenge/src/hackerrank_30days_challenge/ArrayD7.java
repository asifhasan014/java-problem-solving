/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_30days_challenge;

import java.util.Scanner;

/**
 *
 * @author Asif Hasan
 */
public class ArrayD7 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int idx = n - i - 1;
            System.out.print(arr[idx] + " ");
        }

        in.close();
    }
}

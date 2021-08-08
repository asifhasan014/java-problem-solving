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
public class BinaryNumberD10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int sum = 0, max = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                sum++;
                if (sum > max) {
                    max = sum;
                }
            } else {
                sum = 0;
            }
            n = n / 2;
        }
        System.out.println(max);
    }
}

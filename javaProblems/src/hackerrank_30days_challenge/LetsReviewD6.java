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
public class LetsReviewD6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Take length value");
        int N = in.nextInt();

        in.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.println("take string value");
            String string = in.nextLine();
            char[] charArray = string.toCharArray();

            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(charArray[j]);
                }
            }

            System.out.print(" ");

            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 != 0) {
                    System.out.print(charArray[j]);
                }
            }

            System.out.println();
        }

        in.close();
    }
 }
    

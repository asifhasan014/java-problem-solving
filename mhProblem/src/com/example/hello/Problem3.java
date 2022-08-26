package com.example.hello;

import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        boolean condition = true;

        while (condition) {
            System.out.println("Enter array size");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            char arr[] = new char[n];

            System.out.println("Enter the value of your array");
            for (int i = 0; i < arr.length; i++) {
                char value = sc.next().charAt(0);
                arr[i] = value;
            }
            System.out.println("Enter position");
            int position = sc.nextInt();
            System.out.println("Enter calculative lenth");
            int len = sc.nextInt();
            
            System.out.println("your array is ....");
            System.out.println(Arrays.toString(arr));
            char[] returnVal = checkArr(arr,position,len);

            System.out.println("your return array is ....");
            System.out.println(Arrays.toString(returnVal));
            System.out.println("**************** the end *********************");
            System.out.println("Do you want execute it again? then press 1 if no then press 0");
            int rerunProgram = sc.nextInt();

            if (rerunProgram == 0){
                condition = false;
            }
        }
    }

    private static char[] checkArr(char[] arr, int position, int len) {
        char arr2[] = new char[len];
        int remainChar = arr.length - position;
        int j=0;
        if(arr == null || len>arr.length || len < 0 || position < 0 || len > remainChar){
            return null;
        }else {
            for(int i=position;i<=position+len-1;i++){
                arr2[j]=arr[i];
                j++;
            }
        }
        return arr2;
    }
}

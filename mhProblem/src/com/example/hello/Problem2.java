package com.example.hello;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        boolean condition = true;

        while (condition) {
            System.out.println("Enter array size");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.println("Enter the value of your array");
            for (int i = 0; i < arr.length; i++) {
                int value = sc.nextInt();
                arr[i] = value;
            }
            System.out.println("your array is ....");
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    System.out.print(arr[i]);
                } else {
                    System.out.print(arr[i] + ",");
                }
            }
            System.out.print("]" + "\n");
            int returnVal = checkArr(arr);

            System.out.println("return value is : " + returnVal);
            System.out.println("**************** the end *********************");
            System.out.println("Do you want execute it again? then press 1 if no then press 0");
            int rerunProgram = sc.nextInt();

            if (rerunProgram == 0) {
                condition = false;
            }
        }
    }

    private static int checkArr(int[] arr) {
        int evenSum=0;
        int oddSum=0;
        int returnVal = 0;
        if (arr != null && arr.length==1){
            returnVal = arr[0];
        }else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]%2==1){
                    oddSum = oddSum+arr[i];
                }else{
                    evenSum = evenSum+arr[i];
                }
            }
            returnVal = oddSum-evenSum;
        }
        return returnVal;
    }
}

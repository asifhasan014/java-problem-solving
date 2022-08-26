package com.example.hello;

import java.util.Arrays;
import java.util.Scanner;

public class Problem6 {
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
            System.out.println(Arrays.toString(arr));
//            int returnVal = moharishi(arr);
            int returnVal = checkArr(arr);
            System.out.println("POE is : " + returnVal);
            System.out.println("**************** the end *********************");
            System.out.println("Do you want execute it again? then press 1 if no then press 0");
            int rerunProgram = sc.nextInt();

            if (rerunProgram == 0){
                condition = false;
            }
        }
    }

    private static int checkArr( int[] arr ) {
        int poe = -1;
        int[] arr2= new int[arr.length];

        if(arr.length == 1){
            return 0;
        }
        if(arr == null || arr.length == 2){
            return -1;
        }
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            arr2[i]=sum;
        }
        System.out.println("new array "+ Arrays.toString(arr2));
        for (int i=1;i<arr.length-1;i++){
            int leftSum = arr2[i]-arr[i];
            int rightSum = sum-arr2[i];
            if ( leftSum == rightSum ){
                poe = i;
            }
        }
        return poe;
    }
    private static int moharishi(int[] a)
    {
        if (a.length < 3) return -1;
        int i = 0;
        int j = a.length - 1;
        int idx = 1;
        int leftSum = a[i];
        int rightSum = a[j];
        for (int k = 1; k < a.length - 2; k++)
        {
            if (leftSum < rightSum)
            {
                i++;
                leftSum += a[i];
                idx = i + 1;
            }
            else
            {
                j--;
                rightSum += a[j];
                idx = j - 1;
            }
        }
        if (leftSum == rightSum)
            return idx;
        else
            return -1;
    }
}

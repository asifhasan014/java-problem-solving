package com.example.hello;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {
        boolean condition = true;

        while (condition) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter 1st array size");
            int m = sc.nextInt();
            int arr[] = new int[m];

            System.out.println("Enter 2nd array size");
            int n = sc.nextInt();
            int arr2[] = new int[n];

            System.out.println("Enter the value of your 1st array ...");
            for (int i = 0; i < arr.length; i++) {
                int value = sc.nextInt();
                arr[i] = value;
            }

            System.out.println("Enter the value of your 2nd array ...");
            for (int i = 0; i < arr2.length; i++) {
                int value = sc.nextInt();
                arr2[i] = value;
            }

            System.out.println("your 1st array is ....");
            System.out.println(Arrays.toString(arr));
            System.out.println("your 2nd array is ....");
            System.out.println(Arrays.toString(arr2));

//            int[] sortArr = sortArrFunc(arr);
//            int[] sortArr2 = sortArrFunc(arr2);
//
//            System.out.println("your 1st sorted array is ....");
//            System.out.println(Arrays.toString(sortArr));
//            System.out.println("your 2nd sorted array is ....");
//            System.out.println(Arrays.toString(sortArr2));
//            System.out.println("My Code is active");
//            int[] returnVal = checkArr(arr,arr2);
            System.out.println("Moharishi Code is active");
            int[] returnVal = moharishiSolution(arr,arr2);

            System.out.println("return array value is : " + Arrays.toString(returnVal));
            System.out.println("**************** the end *********************");
            System.out.println("Do you want execute it again? then press 1 if no then press 0");
            int rerunProgram = sc.nextInt();

            if (rerunProgram == 0){
                condition = false;
            }
        }
    }

    private static int[] sortArrFunc( int[] arr ) {
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    private static int[] checkArr( int[] arr, int[] arr2 ) {
        int[] resultArr = new int[0];

        if(arr == null || arr2 == null){
            return null;
        }
        if(arr.length>0 && arr2.length>0){
            int len1 = arr.length;
            int len2 = arr2.length;
            
            if ( len1 > len2 ){
                resultArr = new int[len2];
            }else{
                resultArr = new int[len1];
            }
            for(int i=0;i<len1;i++){
                for(int j=0;j<len2;j++){
                    if(arr[i]==arr2[j]){
                        resultArr[j]=arr[i];
                    }
                }
            }
        }
        return resultArr;
    }

    private static int[] moharishiSolution(int[] first, int[] second)
    {
        if (first == null || second == null) return null;
        if (first.length == 0 || second.length == 0) return new int[0];
        int min = (first.length < second.length) ? first.length : second.length;
        int[] a, b;
        if (min == first.length)
        {
            a = first;
            b = second;
        }
        else
        {
            a = second;
            b = first;
        }
        int[] c = new int[min];
        int k = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b.length; j++)
                if (a[i] == b[j])
                {
                    c[k] = a[i];
                    k++;
                }
        int[] retArray = new int[k];
        for (int t = 0; t < retArray.length; t++)
            retArray[t] = c[t];
        return retArray;
    }

}

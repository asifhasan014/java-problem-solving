package javaapplication1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DutchNationalFlag2 {
    public static int size;

    private static void dutchNational(List<Integer> arrList) {
          int mid=0;
          int low=0;
          int max = size-1;
        while (mid <= max) {
//           System.out.println("hello boys");
            switch (arrList.get(mid)) {
                case 0:
                    Collections.swap(arrList,low, mid);
                    low++;
                    mid++;
                    //System.out.println("hello boys");
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    Collections.swap(arrList,mid,max);
                    max--;
                    break;

            }
        }
//      
            System.out.print(arrList);
            

    }

    public static void main(String[] args) {
        System.out.println("enter the array size");
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        int[] arr = new int[size];
        //int max=mainarray.length;

        for (int i = 0; i < size; i++) {
            System.out.print("Element value " + i + ":");
            arr[i] = input.nextInt();
        }
        List<Integer> arrlist = Arrays.stream(arr).boxed().collect(Collectors.toList());
        dutchNational(arrlist);
        //System.out.print(arrlist);
    }
}

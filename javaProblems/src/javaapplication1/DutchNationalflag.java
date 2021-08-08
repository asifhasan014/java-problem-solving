
package javaapplication1;

import java.util.Scanner;

public class DutchNationalflag {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        int size;
        int temp=0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the array size");
        size=input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array element");
        for(i=0;i<size;i++){
            array[i]=input.nextInt();
        }
        System.out.println("");
        for(i=0;i<size-1;i++){
            for(j=0;j<size-1-i;j++){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array");
        for(i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
    }
}

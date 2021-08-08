
package javaapplication1;

import java.util.Scanner;

public class ArrayProblm {
    public static void main(String[] args) {
        int array[]= new int[6];
        int data[]= new int[6];
        int i;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Value :");
        for(i=0;i<array.length;i++){
            array[i]=input.nextInt();
        }
        System.out.println("The value of the array is");
         for(i=0;i<array.length;i++){
             System.out.println("array["+i+"]"+"="+array[i]);
        }
         System.out.println("");
          for(i=0;i<5;i++){
            if(array[i]<array[i+1]){
                     array[i]=array[i+1];
                     data[i]=array[i];                                                    
            }else if(array[i]>array[i+1]){
                     data[i]=-1;
                     data[i+1]=-1;
            }
        }
          System.out.println("Value of data :");
           for(i=0;i<data.length;i++){
             System.out.println("data["+i+"]"+"="+data[i]);
        }
         
         
         
         
         
         
    }
    
    
    
    
    
    
}

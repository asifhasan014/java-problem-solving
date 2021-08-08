package javaapplication1;
//import java.util.Collection;
import java.util.Scanner;

public class ArraySorting {
     public static int low;
     public static int mid;
     public static int size;
     public static int max;
     //public static int max=size-1;
     //public static int[] array= new int[size];
    public static void swaparray(int a,int b) {
        int temp=0;
        temp=a;
        a=b;
        b=temp;  
    }
    private static void dutchNational(int[] array){
        
        while(mid<=max){
//           System.out.println("hello boys");
         switch(array[mid]){
             case 0:
                 swaparray(array[low],array[mid]);
                 //Swap(array[low],array[mid]);
                 low++;
                 mid++;
                 //System.out.println("hello boys");
                 break;
             case 1:
                 mid++;
                 break;
             case 2:
                 
                 swaparray(array[mid],array[max]);
                 max--;
                 break;
         
         }
        }
//        System.out.println("hello boys");
          for(int m=0;m<size;m++){
            System.out.print(array[m]);
            //mainarray[i]=input.nextInt();
            
          }
//        
        
    }
    public static void main(String[] args) {
        System.out.println("enter the array size");
        Scanner input = new Scanner(System.in);
        size=input.nextInt();
        int[] array = new int[size];
        //int max=mainarray.length;
    
        for(int i=0;i<size;i++){
            System.out.print("Element value "+i+":");
            array[i]=input.nextInt();
    }
        
          dutchNational(array);

  
    } 

    
}

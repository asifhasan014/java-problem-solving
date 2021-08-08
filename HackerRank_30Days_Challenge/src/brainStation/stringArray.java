/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brainStation;

import java.util.Arrays;

/**
 *
 * @author Asif Hasan
 */
public class stringArray {
    public static void main(String[] args) {
         String[] strAr1 = {"Apple", "Orange", "Apple","Mango", "Orange", "Mango"};  
         String[] str2 = new String[10];
         int index =0;
         
         for(int i=0;i<strAr1.length;i++){
             int flag = 0;
             for(int j=0; j<i;j++){
                 if(strAr1[i].equals(strAr1[j])){
                     System.out.println(strAr1[i]);
                     flag = 1;
                     break;
                 }
             }
             if(flag==0){
                 str2[index] = strAr1[i];
                 index++;
                 System.out.println(str2[index]);
             }
         }
         System.out.println(Arrays.toString(str2));
         
    }
}

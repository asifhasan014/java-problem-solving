/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aysha.chamak;

import java.util.Scanner;

/**
 *
 * @author Asif Hasan
 */
public class Test {
    
    public static String whatyouDoAfterMarriage(String husbanDied){
        String var = "";
        if(husbanDied.equalsIgnoreCase("yes")){
            System.out.println("Apni ki abar biye korte chan?");
            System.out.println("Type only yes or no");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            
            if(str.equalsIgnoreCase("yes")){
                var="notun jamai niye sukhey santi te ghor korun";
            }else{
               var="ajibon bidoba hoy boiya thaken"; 
            }
        }
        else{
          var="sukey santi te ghor koro";
        }
        return var;
    }
    
    public static void main(String[] args) {
        System.out.println("Type only yes or no");
        System.out.println("Apner jamai ki mara gesey?");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String result = whatyouDoAfterMarriage(str);
        
        System.out.println(result);
    }
}

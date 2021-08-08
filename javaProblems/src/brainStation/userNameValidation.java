/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brainStation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Asif Hasan
 */
public class userNameValidation {
    
    public static void main(String[] args) {
        
        String userName = "Asif_Hasan";
//        String userName = "AsifHaasan_";
        int a =0;
        
        Pattern pattern =  Pattern.compile("^[a-zA-Z]([._-](?![._-])|[a-zA-Z]){3,18}[a-zA-Z]$");
        Matcher matcher = pattern.matcher(userName);
        
        if(matcher.matches()){
            System.out.println("This is a valid username");
        }else{
            System.out.println("this is not a valid username");
        }
    }
    
}

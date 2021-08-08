/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herbertschildtbookproblems.Thread;

/**
 *
 * @author Asif Hasan
 */
public class Synch {
    public static void main(String[] args) {
        
    
    Callme targect = new Callme();
    Caller ob1 = new Caller(targect,"Hello");
    Caller ob2 = new Caller(targect,"Synchronize");
    Caller ob3 = new Caller(targect,"World");
    
    ob1.t.start();
    ob2.t.start();
    ob3.t.start();
    
    try{
        ob1.t.join();
        ob2.t.join();
        ob3.t.join();
    }catch(Exception e){
        System.out.println("Interrupted");
    }
    
    }
    
}

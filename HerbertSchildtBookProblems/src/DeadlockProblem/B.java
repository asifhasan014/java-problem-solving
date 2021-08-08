/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeadlockProblem;

/**
 *
 * @author Asif Hasan
 */
public class B {
    synchronized  void bar(A a){
        String name=Thread.currentThread().getName();
        System.out.println(name+"entered B.bar()");
        try{
        Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("Exception"+e);
        }
        System.out.println(name+"Trying to call A.last()");
        a.last();
    }
    
   synchronized void last() {
       System.out.println("Inside B.last()");
    }
    
}

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
public class Multiplethread_1 {

    public static void main(String[] args) throws InterruptedException {
        Multiplethread_2 nt1 = new Multiplethread_2("One");
        Multiplethread_2 nt2 = new Multiplethread_2("Two");
        Multiplethread_2 nt3 = new Multiplethread_2("Three");
        
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();
        
        try{
            Thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread existing");
    }

}

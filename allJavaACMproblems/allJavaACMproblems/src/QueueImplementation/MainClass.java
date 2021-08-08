/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueueImplementation;

/**
 *
 * @author Asif Hasan
 */
public class MainClass {
    public static void main(String[] args) {
        Queue qc = new Queue();
        qc.enQueue(10);
        qc.enQueue(20);
        qc.enQueue(30);
        qc.enQueue(40);
        qc.enQueue(50);
        
        qc.show();
        
        System.out.println("DQue is start");
        qc.dQueue();
        qc.dQueue();
        qc.dQueue();
        qc.dQueue();
        qc.dQueue();
       
        qc.show();
        qc.dQueue();
        
        qc.enQueue(70);
        qc.enQueue(80);
        qc.enQueue(90);
        
        qc.show();
    }
}

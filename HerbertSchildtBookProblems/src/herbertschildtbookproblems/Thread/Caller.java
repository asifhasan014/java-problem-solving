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
public class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;
    public void display(){
        System.out.println("hello asif");
    }
    public Caller(Callme targ,String s){
       this.target=targ;
       this.msg=s;
       t=new Thread(this);
    }

    @Override
    public void run() {
        target.call(msg);
    }
    
}

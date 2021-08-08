/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicStack;

public class MainClass {
    public static void main(String[] args) {
        DStack sc = new DStack();
        
        sc.push(10);
        sc.push(20);
        sc.push(30);
        sc.push(40);
        sc.push(50);
        
        sc.show();
        
        sc.pop();
        sc.pop();
        sc.pop();
        
        sc.show();
    }
 
}

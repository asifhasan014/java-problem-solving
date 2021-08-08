/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkListPractice;

public class MainClass {
    public static void main(String[] args) {
        FunctionClass fc = new FunctionClass();
        fc.insert(10);
        fc.insert(20);
        fc.insert(30);
        fc.insert(40);
        fc.insert(50);
//        fc.insertAtStart(05);
//        fc.insertAtPosition(60, 2);
        fc.deleteAt(1);
        fc.display();
    }
    
}

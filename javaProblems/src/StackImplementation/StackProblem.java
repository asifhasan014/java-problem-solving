/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackImplementation;

public class StackProblem {
    int stack[]= new int[5];
    int top=0;
    
    public void push(int data){
        if(top>4){
            System.out.println("Over flow occured");
        }else{
        stack[top]=data;
        top++;
        }
    }
    
    public void pop(){
        if(isEmpty()){
            System.out.println("stack is underflow");
        }else{
        top--;
        stack[top]=0;
        }
    }
    public boolean isEmpty(){
        return top<=0;
    }
    public int size(){
        return top;
    }
    
     public int peek(){
         int data;
         data=stack[top-1];
         
         return data;
    }
    
    public void show(){
    for(int data : stack){
        System.out.print(data+" ");
    }
        System.out.println(" ");
    }
    
}

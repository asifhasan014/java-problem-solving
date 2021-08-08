package StackImplUsigLinkList;


public class MainClass {
    public static void main(String[] args) {
        Impl sc = new Impl();
        
        sc.push(1);
        sc.push(2);
        sc.push(3);
        sc.push(4);
        sc.push(5);
        //sc.pop();
        
        sc.display();
        int a = sc.size();
        System.out.println("Size of linklist "+a);
    }
  
}

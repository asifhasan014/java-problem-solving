
package alljavaacmproblems;

//output: 2 1 4 3 6 5 8 7 10 9
public class IndirectRecursion {
    static int n=1;
    static void even(){
       if(n<=10){
            System.out.print((n-1)+" ");
            n++;
            odd();
        }
        return; 
    }
    static void odd(){
        if(n<=10){
            System.out.print((n+1)+" ");
            n++;
            even();
        }
        return;
    }
    public static void main(String[] args) {
        odd();
    }
}

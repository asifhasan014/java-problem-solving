
package alljavaacmproblems;

public class Piramid2 {
    public static void main(String[] args){
        int i,j,k=4,m=5;
        
        for(i=0;i<5;i++){
            for(j=0;j<k;j++){
                System.out.print("*");   
            }
            k--;
            for(j=4;j<m;j++){
               System.out.print("A");
           }
            m=m+2;
            System.out.println("");
        }
        
    }
}

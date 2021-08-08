package hackerrank_30days_challenge;

public class DublicacyCheck {

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,4,4,5,5};
        int b = 0;
        int c = 0;
        arr[b] = arr[0];
        System.out.println(arr[b]);
        System.out.println("");
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[b] != arr[i]) {
                b++;
                arr[b] = arr[i];
            }
        }
        for (int i = 0; i <= b; i++) {
            c++;
            System.out.print(arr[i] + "\t");
        }
        System.out.println("Size "+c);
    }

}

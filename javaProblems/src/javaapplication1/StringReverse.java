package javaapplication1;

import java.util.Scanner;

public class StringReverse {
    static void Only_word_reverse(String str){
        String array[]=str.split(" ");
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
    }

    static void Palindrom(String str) {
        int begin = 0;
        int end = str.length() - 1;
        int middle = (begin + end) / 2;
        int i;
        for (i = begin; i <= middle; i++) {
            if (str.charAt(begin) == str.charAt(end)) {
                begin++;
                end--;
            } else {
                break;
            }
        }
        //System.out.println(i);
        if (i == middle + 1) {
            System.out.println("Plindrom");
        } else {
            System.out.println("Not palindrom");
        }

    }

    static void Reverse(String inputString) {
        String reversString = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversString = reversString + inputString.charAt(i);
        }
        System.out.println(reversString);
    }

    static void Each_word_reverse(String inputString) {
        String words[] = inputString.split(" ");
        String reverseString = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversword = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reversword = reversword + word.charAt(j);
            }
            reverseString = reverseString + reversword + " ";
        }
        System.out.println(reverseString);
    }

    public static void main(String[] args) {
        int option = 0;
        Scanner input = new Scanner(System.in);
        //System.out.println(str);
        System.out.println("Enter the string");
        String str;
        str = input.nextLine();

        System.out.println("Please Enter a option");
        System.out.println("1. Reverse");
        System.out.println("2. Palindrom");
        System.out.println("3. Only word reverse");
        System.out.println("4. Each word reverse");
        System.out.println("5. Exit");
        System.out.println();

        do {
            System.out.println("========================================");
            System.out.print("Please Enter an option :");
            option = input.nextInt();
            System.out.println("========================================");
            switch (option) {
                case 1:
                    //System.out.println("Reverse");
                    Reverse(str);
                    break;
                case 2:
                    //String array[]=new String[10];
                    //System.out.println("Palindrom");
                    Palindrom(str);
                    break;
                case 3:
                    //System.out.println("Only word reverse");
                    Only_word_reverse(str);
                    break;
                case 4:
                    //System.out.println("Each word reverse");
                    Each_word_reverse(str);
                    break;
                default:
                    System.out.println("Exit");
                    break;
            }
        } while (option != 5);

    }
}

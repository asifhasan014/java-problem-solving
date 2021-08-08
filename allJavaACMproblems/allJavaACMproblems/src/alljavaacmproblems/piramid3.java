package alljavaacmproblems;

import java.util.Scanner;

public class piramid3 {

    public static void main(String[] args) {
        int i, j, k = 4, m = 5;
        Character ch;
        System.out.println("Please Write the letter A");
        Scanner input = new Scanner(System.in);
        ch = input.next().charAt(0);
        System.out.println("Your Requird piramid is :");
        for (i = 0; i < 5; i++) {
            ch = 'A';
            for (j = 0; j < k; j++) {
                System.out.print(" ");
            }
            k--;
            for (j = 4; j < m; j++) {
                System.out.print(ch);
                int s = Charactertointeger(ch);
                s = s + 1;
                ch = integertocharacter(s);

            }
            ch = (char) (ch - 2);
            for (j = 5; j < m; j++) {
                System.out.print(ch);
                ch--;
            }
            m = m + 1;
            System.out.println("");
        }

    }

    private static Integer Charactertointeger(Character cha) {
        Character value = cha;
        int y = cha;
        return y;
    }

    private static Character integertocharacter(int cha) {
        int value = cha;
        Character y = (char) cha;
        return y;
    }
}

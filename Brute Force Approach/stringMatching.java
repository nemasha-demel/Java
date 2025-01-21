//Brute Force Approach

import java.util.Scanner;

public class stringMatching {
    public static void matchingPattern(String pattern, String text){
        int Lt = text.length();
        int Lp = pattern.length();

        for (int i = 0; i <= Lt- Lp; i++) {
            int j;
            for ( j = 0; j < Lp; j++) {
                if (pattern.charAt(j) != text.charAt(i+j)) {
                    break;
                }

            }
            if (j== Lp) {
                System.out.println("Match found at "+ (i+1));
                
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text1 = sc.nextLine();
        System.out.print("Enter a pattern: ");
        String pattern1 = sc.nextLine();

        matchingPattern(pattern1, text1);
    }    
}

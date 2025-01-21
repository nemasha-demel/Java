import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input and store stick lengths
        int[] sticks = new int[8];
        for (int i = 0; i < 8; i++) {
            sticks[i] = scanner.nextInt();
        }
        
        // Sort the sticks to easily access the largest and smallest groups
        Arrays.sort(sticks);
        
        // Group A: The 4 longest sticks
        int[] groupA = Arrays.copyOfRange(sticks, 4, 8);
        
        // Group B: The 4 shortest sticks
        int[] groupB = Arrays.copyOfRange(sticks, 0, 4);
        
        // Possible triangle classifications
        boolean obtuseTriangle = false;
        boolean acuteTriangle = false;
        boolean degenerateTriangle = false;
        
        // Check combinations with one stick from group A and two from group B, and vice versa
        for (int i = 0; i < 4; i++) { // Pick one stick from group A
            for (int j = 0; j < 4; j++) { // Pick two sticks from group B
                for (int k = j + 1; k < 4; k++) {
                    if (isValidTriangle(groupA[i], groupB[j], groupB[k])) {
                        if (isObtuse(groupA[i], groupB[j], groupB[k])) obtuseTriangle = true;
                        else acuteTriangle = true;
                    } else if (isDegenerate(groupA[i], groupB[j], groupB[k])) {
                        degenerateTriangle = true;
                    }
                }
            }
        }
        
        for (int i = 0; i < 4; i++) { // Pick one stick from group B
            for (int j = 0; j < 4; j++) { // Pick two sticks from group A
                for (int k = j + 1; k < 4; k++) {
                    if (isValidTriangle(groupB[i], groupA[j], groupA[k])) {
                        if (isObtuse(groupB[i], groupA[j], groupA[k])) obtuseTriangle = true;
                        else acuteTriangle = true;
                    } else if (isDegenerate(groupB[i], groupA[j], groupA[k])) {
                        degenerateTriangle = true;
                    }
                }
            }
        }
        
        // Determine the output based on possible classifications
        if (obtuseTriangle) System.out.println("OBTUSE TRIANGLE");
        else if (acuteTriangle) System.out.println("ACUTE TRIANGLE");
        else if (degenerateTriangle) System.out.println("DEGENERATE TRIANGLE");
        else System.out.println("IMPOSSIBLE");
    }

    // Method to check if three lengths can form a valid triangle
    private static boolean isValidTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    // Method to check if three lengths form a degenerate triangle
    private static boolean isDegenerate(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }

    // Method to check if three lengths form an obtuse triangle
    private static boolean isObtuse(int a, int b, int c) {
        int[] sides = {a, b, c};
        Arrays.sort(sides); // Sort to make the largest side last
        return (sides[0] * sides[0] + sides[1] * sides[1]) < (sides[2] * sides[2]);
    }
}

import java.util.Scanner;

public class StarTriangle {
    public void triangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number: ");
        int num = sc.nextInt();
        StarTriangle objStarTriangle = new StarTriangle();
        objStarTriangle.triangle(num);

    }

}

import java.util.Scanner;

public class bubblesort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elememts: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int temp=0;
        
       
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("After sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
          
        }
    }
}
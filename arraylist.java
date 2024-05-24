import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(10);
        arr.add(25);
        arr.add(53);
        System.out.println(arr);

        arr.add(1,65);
        System.out.println(arr);

        //To change the value
        arr.set(0, 21);
        System.out.println(arr);

        //To get the value
        int elem = arr.get(3);
        System.out.println(elem);

        //To print array list
        System.out.println("First method to print");
        for (Integer element : arr) {
            System.out.println(element);
            
        }

        System.out.println("");

        System.out.println("Second method to print");

        arr.forEach(x-> System.out.println(x));

    }
    
}

//Overloading = same method name but different parameters
public class Constructors {
    int amount;

    Constructors() {
        amount = 0;
    }

    Constructors(int x) {
        amount = x;
    }

    public static void main(String[] args) {
        Constructors obj1 = new Constructors();
        System.out.println(obj1.amount);

        Constructors obj2 = new Constructors(50);
        System.out.println(obj2.amount);
    }

}

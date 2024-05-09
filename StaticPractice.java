public class StaticPractice {
    int x;
    static int y;

    void printnonStatic() {

    }

    static void printStatic() {

    }

    public static void main(String[] args) {
        // By using static keyword we can directly access those variables and methods
        // through main method.
        y = 10;
        printStatic();

        // To access non static variables and methods, we have to create objects
        StaticPractice obj = new StaticPractice();
        obj.x = 20;
        obj.printnonStatic();
    }
}
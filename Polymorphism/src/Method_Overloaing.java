public class Method_Overloaing {
    public void method() {
        System.out.println("No parameters");
    }

    public void method(int x) {
        System.out.println("one interger type paramter: " + x);
    }

    public void method(double y) {
        System.out.println("One double type parameter: " + y);
    }

    public void method(String x, String y) {
        System.out.println("Two parameters: " + x + " " + y);
    }

    public void print() {
        System.out.println("Good morning");
    }

    public static void main(String[] args) {
        Method_Overloaing obj = new Method_Overloaing();
        obj.method();
        obj.method(10);
        obj.method(20.5);
        obj.method("Hello", "World");
    }

}

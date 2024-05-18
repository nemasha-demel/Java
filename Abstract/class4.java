public class class4 implements class3 {
    // Methods shuold be public
    public void eat() {
        System.out.println("Eating");
    }

    public void drink() {
        System.out.println("Drinking");
    }

    public void study() {
        System.out.println("Studying");
    }

    public static void main(String[] args) {
        /*
         * class4 objClass4 = new class4();
         * objClass4.eat();
         */

        class3 objClass3 = new class4(); // Can create objects of interface class
        System.out.println(objClass3.age);

        /* */
    }

}

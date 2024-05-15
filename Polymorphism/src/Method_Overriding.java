public class Method_Overriding extends Method_Overloaing {

    @Override
    public void print() { // Change the body of print method which is implemented on Method_overloading
                          // class
        System.out.println("Good Night");
    }

    public static void main(String[] args) {
        Method_Overriding obj1 = new Method_Overriding();
        obj1.print();
    }

}

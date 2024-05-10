//We can call methods which are implemented in oldphone class also. newphone is inherited from oldphone 
//and latestphone is inherited from newphone.
public class latestphone extends newphone {
    public static void main(String[] args) {
        latestphone obj1 = new latestphone();
        obj1.message();
        obj1.call();
        obj1.browseinternet();
    }

}

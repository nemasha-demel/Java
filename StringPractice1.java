public class StringPractice1 {
  public static void main(String[] args){
    String s1 = "hello";
    String s2 = "hello";
    //Here output is yes. If variable values are same, only one memory address is allocated for both variables s1 and s2
    if (s1 == s2){
      System.out.println("yes");
    } else{
      System.out.println("no");
    }

    String s1 = new String("hello");
    String s2 = new String("hello");
    //Here output is no.In this code two objects are created.For this objects seperate memory spaces are allocated.
    if (s1 == s2){
      System.out.println("yes");
    } else{
      System.out.println("no");
    }

    //char array to string
    char[] charArray = {'j','a','v','a'};
    String str = new String(charArray);
    System.out.println(str);
  }
}

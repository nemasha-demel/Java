import java.util.InputMismatchException;
import java.util.Scanner;
 public class ExceptionHandling {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        
		
        try {
			System.out.print("Enter an integer: ");
			a = sc.nextInt();
			System.out.print("Enter an integer: ");
			b = sc.nextInt();
            c = a/b;
            System.out.println("The answer is "+ c);
        } catch (ArithmeticException e) {
            System.out.println("Can not divide by zero");
        }
        catch(InputMismatchException e){
            System.out.println("Not an integer value");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Done");
        }
        sc.close();


    }
 }
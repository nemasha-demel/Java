//printf() method outputs a formatted string
// two arguments = format string  + (object/variable/value)
// % -  format specifier
//%[flags] [precison] [width] [conversion-character]

//[conversion-character]
//   d - decimal integer number
//   b - boolean
//   c - charactor
//   s - string
//   f - double values, floating point numbers
//   e - scientific representation

import java.util.Scanner;

public class exercise{
    public static void main(String[] args) {
        String s1 = "Nemasha";
        double myDouble = 20020123;
        int num = 23;
        char mychar = '@';

        //[conversion-character]
        //   d - decimal integer number
        //   b - boolean
        //   c - charactor
        //   s - string
        //   f - double values, floating point numbers

        System.out.printf("This is a format string %d",123); 
        System.out.printf("\nThe statement is %b",true);
        System.out.printf("\nA charactor - %c",'N'); 
        System.out.printf("\nA String - %s",s1); 
        System.out.printf("\nA Double value - %f",456.2);
        
        System.out.printf("\nA Double value - %f",myDouble); 

        //width 
        // minimum number of characters to be written as output
        // if a neagitive number, makes the output left-justified by adding any padding spaces

        System.out.printf("\nA String - %10s",s1); 
        System.out.printf("\nA String - %-10s",s1); 

        //precision
        // sets numer of digits of precision when outputting floating point values
        System.out.printf("\nA Double value - %.3f",myDouble); 

        //Flags
        // adds an effect to output based on the flag added to format specifier
        // - : left justify
        // + : output a plus(+) or minus(-) sign for a numeric value
        // 0 : numberic value are zero padded
        // , : comma grouping seperator if number >1000

        System.out.printf("\nA Left justified - %-20f",myDouble); //lest justify
        System.out.printf("\nA Right justified - %20f",myDouble); // right justify
        double mydouble2 = -23;
        System.out.printf("\nA Postive or negative - %+f",myDouble);
        System.out.printf("\nA Postive or negative - %+f",mydouble2);
        System.out.printf("\nA Zero padded - %020f",myDouble);
        System.out.printf("\nA Comma - %,f%n",myDouble);

      




        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String word = sc.next();
            int x = sc.nextInt();

            System.out.printf("%-15s%03d%n",word,x);
            
        }

        System.out.println("================================");

 

    }
}
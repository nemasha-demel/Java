public class StringPractice2 {
    public static void main(String[] args) {
        String str = "hello world";
        String str2 = "welcome";

        System.out.println(str.length()); // Prints length of the string
        System.out.println(str + " " + str2);
        System.out.println(str.concat(" ").concat(str2)); // Another way to combine two strings
        System.out.println(str2.toUpperCase()); // To convert to upercase
        System.out.println(str.replace('o', 'f')); // To replace all o's with f
        System.out.println(str.replaceFirst("o", "n")); // Replace type should be string type. Only replaces first o
    }
}
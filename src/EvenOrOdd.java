public class EvenOrOdd {
    public static String even_or_odd(int number) {
        /*
        Create a function (or write a script in Shell) that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
         */

        if(number%2 != 0) {
            return "odd";
        }
        return "even";
    }
}
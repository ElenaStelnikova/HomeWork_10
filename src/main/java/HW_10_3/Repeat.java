package HW_10_3;

public class Repeat {
    //https://www.codewars.com/kata/57a0e5c372292dd76d000d7e/train/java
    //Write a function that accepts an integer n and a string s as parameters,
    // and returns a string of s repeated exactly n times.
    //
    //Examples (input -> output)
    //6, "I"     -> "IIIIII"
    //5, "Hello" -> "HelloHelloHelloHelloHello"
    public static String repeatStr(final int repeat, final String string) {


        return string.repeat(repeat);
    }


}

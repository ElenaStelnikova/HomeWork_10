package HW_10_1;

public class BasicOperations {
    //Your task is to create a function that does four basic mathematical operations.
    //
    //The function should take three arguments - operation(string/char), value1(number),
    // value2(number).
    //The function should return result of numbers after applying the chosen operation.

    //('+', 4, 7) --> 11
    //('-', 15, 18) --> -3
    //('*', 5, 5) --> 25
    //('/', 49, 7) --> 7

    public static Integer basicMath(String op, int v1, int v2) {

        if (op.equals("+")) {
            return v1 + v2;
        }
        if (op.equals("-")) {
            return v1 - v2;
        }
        if (op.equals("*")) {
            return v1 * v2;
        }
        if (op.equals("/")) {
            return v1 / v2;
        }
        return 0;
    }


}

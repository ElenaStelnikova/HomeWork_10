package HW_10_1;

public class Sequence {
    //Build a function that returns an array of integers from n to 1 where n>0.
    //
    //Example : n=5 --> [5,4,3,2,1]
    public static int[] reverse(int n){

        int[] array = new int [n];
        int count = 0;
        for (int i = n; i > 0; i--) {
            array[count] = i;
            count++;
        }
        return array;
    }
}

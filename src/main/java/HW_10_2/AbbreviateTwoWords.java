package HW_10_2;

public class AbbreviateTwoWords {
    //https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
    //Write a function to convert a name into initials. This kata strictly takes two words
    // with one space in between them.
    //
    //The output should be two capital letters with a dot separating them.
    //
    //It should look like this:
    //
    //Sam Harris => S.H
    //
    //patrick feeney => P.F

    public static String abbrevName(String name) {
        
        String[] array = name.toUpperCase().split(" ");
        return array[0].charAt(0) + "." + array[1].charAt(0);

        //name = name.toUpperCase();
        //return name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1);


    }


}

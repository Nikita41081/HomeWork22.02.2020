package homework;

import java.util.stream.IntStream;

import java.util.Arrays;

public class Example20CheckForValue {
    static boolean found;

    public static void main(String[] args) {
        //
        System.out.println("Lets find a value of an Integer Array First ::");
        int[] num = {1, 2, 3, 4, 5};
        int toFind = 3;
        boolean found = false;

        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");

        //String array specific value search
        System.out.println("Lets find for String Array First ::");
        String[] strings = {"One", "Two", "Three", "Four", "Five"};
        String toFind2 = "Four";

        found = Arrays.stream(strings).anyMatch(t -> t.equals(toFind2));

        if(found)
            System.out.println(toFind2 + " is found.");
        else
            System.out.println(toFind2 + " is not found.");
    }
}

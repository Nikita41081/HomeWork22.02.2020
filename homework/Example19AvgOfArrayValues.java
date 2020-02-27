package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Example19AvgOfArrayValues {

    public static void main(String args[]) {
        System.out.println("Enter the required size of the array :: ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int myArray[] = new int[size];
        int avg, sum = 0;
        System.out.println("Enter the elements of the array one by one ");

        for (int i = 0; i < size; i++) {
            myArray[i] = s.nextInt();
            sum = sum + myArray[i];
        }
        avg = sum / size;
        System.out.println("Elements of the array are: " + Arrays.toString(myArray));
        System.out.println("Average of the total array elements is ::" + avg);
    }
}

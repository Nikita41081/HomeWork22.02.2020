package homework;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Example16SortAnArray {
    //Write a java program to sort a numeric array and a string array
    public static void main(String[] args) {
        int count, temp;
        //User inputs the array size
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements you want in the array: ");
        count = scan.nextInt();

        int num[] = new int[count];
        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++) {
            num[i] = scan.nextInt();
        }

        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < count - 1; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.print(num[count - 1]);
        /*System.out.println("Now Lets Try for String Arrays:::");
        String[] myArray=ne [count];

        System.out.println("Enter number of elements you want in the String array: ");
        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++) {
            num[i] = scan.nextInt();
        }
        int size = myArray.length;

        for(int i = 0; i<size-1; i++) {
            for (int j = i+1; j<myArray.length; j++) {
                if(myArray[i].compareTo(myArray[j])>0) {
                    String temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));*/

    }

}

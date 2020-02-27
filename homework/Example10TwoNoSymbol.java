package homework;

import java.util.Scanner;

public class Example10TwoNoSymbol {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter First No.:: ");
        int i=sc.nextInt();
        System.out.println("Please Enter Second No.:: ");
        int j=sc.nextInt();
        System.out.println("Select An Operator here:: '+'or'-'or'/'or'*'::");
        char ch = sc.next().charAt(0);
        System.out.println("Operation selected is ::"+ch+"::");
        System.out.println(i+ch+j);
    }
}

package homework;

import java.util.Scanner;

public class Exercise8AlphabetAtoZ {
    static String AnyChar;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dear Friend Please Enter Any Alphabet from A to Z or a to z::");
        AnyChar = sc.nextLine();
        AnyChar=AnyChar.toLowerCase();
        System.out.println("City Name Starting with ' "+AnyChar+" ' is::");
        if (AnyChar.equals("a")) System.out.println("Ahmedabad ");
        else if (AnyChar.equals("b"))System.out.println("Baroda");
        else if (AnyChar.equals("c")) System.out.println("Chandigarh");
        else if (AnyChar.equals("d")) System.out.println("Dehradun");
        else if (AnyChar.equals("e")) System.out.println("Etawah");
        else if (AnyChar.equals("g")) System.out.println("Gandhidham");
        else if (AnyChar.equals("h")) System.out.println("Haridwar");
        else if (AnyChar.equals("i")) System.out.println("Imphal");
        else if (AnyChar.equals("j")) System.out.println("Jamnagar");
        else if (AnyChar.equals("k")) System.out.println("Khanpur");
        else if (AnyChar.equals("l")) System.out.println("Lucknow");
        else if (AnyChar.equals("m")) System.out.println("Mirzoram");
        else if (AnyChar.equals("n")) System.out.println("Nashik");
        else if (AnyChar.equals("o")) System.out.println("Orai");
        else if (AnyChar.equals("p")) System.out.println("Panvel");
        else if (AnyChar.equals("r")) System.out.println("Rajkot");
        else if (AnyChar.equals("s")) System.out.println("Srinagar");
        else if (AnyChar.equals("t")) System.out.println("Tripura");
        else if (AnyChar.equals("u")) System.out.println("Udaipur");
        else if (AnyChar.equals("v")) System.out.println("Varanasi");
        else if (AnyChar.equals("w")) System.out.println("Warangal");
        else if (AnyChar.equals("x")) System.out.println("Xelvona");
        else if (AnyChar.equals("y")) System.out.println("Yamunanagar");
        else if (AnyChar.equals("z")) System.out.println("Zasi");
        else System.out.println("Invalid Entry :: Enter valid Character");
    }
}

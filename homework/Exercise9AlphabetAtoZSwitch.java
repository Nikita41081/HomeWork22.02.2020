package homework;

import java.util.Scanner;

public class Exercise9AlphabetAtoZSwitch {
    static String AnyChar;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dear Friend Please Enter Any Alphabet from A to K or a to k::");
        AnyChar = sc.nextLine();
        AnyChar = AnyChar.toLowerCase();
        System.out.println("City Name Starting with ' " + AnyChar + " ' is::");
        switch (AnyChar) {
            case "a":
                System.out.println("Ahmedabad ");
                break;
            case "b":
                System.out.println("Baroda");break;
            case "c":
                System.out.println("Chandigarh");break;
            case "d":
                System.out.println("Dehradun");break;
            case "e":
                System.out.println("Etawah");break;
            case "f":
                System.out.println("Faridabad");break;
            case "g":
                System.out.println("Gandhidham");break;
            case "h":
                System.out.println("Haridwar");break;
            case "i":
                System.out.println("Imphal");break;
            case "j":
                System.out.println("Jamnagar");break;
            case "k":
                System.out.println("Khanpur");break;

        }
    }
}
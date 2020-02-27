package homework;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Example12SymbolCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press Any Key from your KeyBoard ::");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println(ch + " is A ALPHABET.");

        } else if (ch >= '0' && ch <= '9') {

            System.out.println(ch + " is A DIGIT.");

        } else {

            System.out.println(ch + " is A SPECIAL CHARACTER.");
        }
    }
}

package homework;

import java.util.Scanner;

public class Example3MathSciEngMarksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Student Name :: ");
        String name = sc.nextLine();
        System.out.println("Please Enter Student Roll No.:: ");
        int roll_no = sc.nextInt();
        String[] sub = {"Maths", "Science", "English"};
        int marks[] = new int[3];
        double total = 0;
        double percent = 0;
        String grade="", result="";
        System.out.println("Please enter Marks of All 3 Subjects between 0 to 100 :");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the marks for " + sub[i]);
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }
        for (int i = 0; i < 3; i++){
            if (marks[i] < 35) {
            System.out.println("Sorry You are Failed in Exam");
            break;}
            else result = "Pass";
        }
        if (result=="Pass") {
            percent = (total / 300) * 100;
            System.out.println("Dear " + name + " you are Pass and your MarkSheet is as per below ::");
            if (percent >= 80) grade = "A+";
            else if (percent >= 60 && percent < 80) grade = "A";
            else if (percent >= 50 && percent < 60) grade = "B";
            else if (percent >= 35 && percent < 50) grade = "C";
            System.out.println("___________________________");
            System.out.println("|       Mark Sheet        |");
            System.out.println("|=========================|");
            System.out.println("|  Name       :: " + name + "   |");
            System.out.println("|  Roll No.   :: " + roll_no + "      |");
            System.out.println("|_________________________|");
            System.out.println("|  SUBJECTS   -  MARKS    |");
            System.out.println("|_________________________|");
            System.out.println("|  Maths      :: " + marks[0] + "      |");
            System.out.println("|  Science    :: " + marks[1] + "      |");
            System.out.println("|  English    :: " + marks[2] + "      |");
            System.out.println("|_________________________|");
            System.out.println("|  TOTAL      -   " + total + "    |");
            System.out.println("|_________________________|");
            System.out.println("|  PERCENTAGE - " + percent + "%     |");
            System.out.println("|  Result     - " + result + "       |");
            System.out.println("|  Grade      - " + grade + "        |");
            System.out.println("___________________________");
        }
    }
}

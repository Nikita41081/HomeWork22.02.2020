package homework;

import java.util.Scanner;

public class Example4IsLeapAndNoOfDaysInMonth {
    public static boolean isLeapYear(int y) {
        if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) {
            System.out.println("Specified year is a leap year");
            return true;
        } else {
            System.out.println("Specified year is not a leap year");
            return false;
        }
    }

    public static void getDaysInMonth(int year, int month) {
        //if(y>=1&&y<=12) return true;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("\n 31 Days in this Month");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("\n 30 Days in this Month");
        } else if (month == 2) {
            if (isLeapYear(year) == true) System.out.println("\n 29 Days are there in this Month");
            else System.out.println("\n 28 Days are there in this Month");
        } else
            System.out.println("\n Please enter Valid Number between 1 to 12");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, month;
        boolean i;
        System.out.println("Enter an Year :: ");
        year = sc.nextInt();
        if (year >= 1 && year <= 9999) {
            System.out.println(i = isLeapYear(year));
        } else {
            System.out.println("The Year is not a Valid year :: Please enter it between 1 to 9999 ");
        }
        System.out.println("Please Enter Month Number from 1 to 12 (ie.Jan to Dec) to count its days ");
        month = sc.nextInt();
        getDaysInMonth(year, month);
    }
}

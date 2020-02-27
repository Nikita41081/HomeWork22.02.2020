package homework;

import java.util.Scanner;

public class Example7SalesCommission {
    static int SalesId, SalaryBasic;
    static String SellerName;
    static double CommissionRate;
    static double TotalSales, Commission;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dear Seller Please Enter Your Name::");
        SellerName = sc.nextLine();
        System.out.println("Please Enter Sales ID::");
        SalesId = sc.nextInt();
        System.out.println("Please enter Sales Amount::");
        TotalSales = sc.nextDouble();
        if (TotalSales >= 50000)
            CommissionRate = 0.35;
        else if (TotalSales >= 30000)
            CommissionRate = 0.2;
        else if (TotalSales >= 20000)
            CommissionRate = 0.1;
        else if (TotalSales >= 10000)
            CommissionRate = 0.05;
        else if (TotalSales <10000)
            CommissionRate = 0.02;
        Commission = CommissionRate * TotalSales;
        System.out.println("Congratulations!! "+SellerName);
        System.out.println("You've got The Commission of "+(CommissionRate*100)+"% ie. Rs." + Commission);
    }
}



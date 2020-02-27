package homework;

import java.util.Scanner;

public class Example5SalarySlip {
    static int EmpID, basicSalary, HRA, TA, DA, PF, grossSalary;
    static String EmpName;
    public static void mySalarySlip(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name:: ");
        EmpName= sc.nextLine();
        System.out.println("Enter Employee ID:: ");
        EmpID = sc.nextInt();
        System.out.println("Enter Basic Salary:: ");
        basicSalary = sc.nextInt();
        HRA = (basicSalary*10)/100;
        TA = (basicSalary*8)/100;
        DA = (basicSalary*9)/100;
        PF= (basicSalary*20)/100;
        grossSalary = basicSalary+HRA+TA+DA-PF;
        System.out.println("Please find your Salary Slip below::");
        System.out.println("________________________");
        System.out.println("|      Salary Slip     |");
        System.out.println("|======================|");
        System.out.println("| Employee ID  : "+EmpID+"  |");
        System.out.println("| Employee Name: "+EmpName+"  |");
        System.out.println("|______________________|");
        System.out.println("| Basic Salary : "+basicSalary+"|");
        System.out.println("| HRA 10%      : "+HRA+"  |");
        System.out.println("| TA 8%        : "+TA+"  |");
        System.out.println("| DA 8%        : "+DA+"  |");
        System.out.println("| PF 20%       : "+PF+"  |");
        System.out.println("|______________________|");
        System.out.println("| Gross Salary : "+grossSalary+"  |");
        System.out.println("|======================|");
    }
    public static void main(String[] args) {
        mySalarySlip();
    }
}

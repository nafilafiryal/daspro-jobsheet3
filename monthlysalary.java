import java.util.Scanner;

/**
 * monthlysalary
 */
public class monthlysalary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double hoursWorked;
        double hourlyWages;
        double bonusPercentage = 1.0;
        double taxPercentage = 0.05;
        double monthlysalary;
        double salaryBeforeTax;
        double bonus;
        double totalBeforeTax;
        double taxAmount;
        double totalAfterTax;

        System.out.println("Enter the hours worked: ");
        hoursWorked = input.nextDouble();
        System.out.println("Enter the hourly wages: ");
        hourlyWages = input.nextDouble();

        salaryBeforeTax = hourlyWages * hoursWorked;
        bonus = bonusPercentage * salaryBeforeTax;
        totalBeforeTax = salaryBeforeTax + bonus;
        taxAmount = taxPercentage * totalBeforeTax;
        totalAfterTax = totalBeforeTax * taxAmount;

        System.out.println("Total salary before tax: " + salaryBeforeTax);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total salary including bonus before tax: " + totalBeforeTax);
        System.out.println("Tax amount: " + taxAmount);
        System.out.println("Total salary after tax: " + totalAfterTax);



    }
}
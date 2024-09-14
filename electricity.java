import java.util.Scanner;

/**
 * electricity
 */
public class electricity {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double electricityUsage;
        double tariff_per_kWh = 1500.0;
        double totalBill;
        boolean exceeds500kWh;

        System.out.println("Enter electricity usage in kWh: ");
        electricityUsage = input.nextDouble();
        
        totalBill = electricityUsage * tariff_per_kWh;
        exceeds500kWh = electricityUsage > 500;

        System.out.println("Total electricity bill: Rp " + totalBill);
        System.out.println("Does the usage exceed 500 kWh? " + (exceeds500kWh ? "yes" : "no"));



    }
}
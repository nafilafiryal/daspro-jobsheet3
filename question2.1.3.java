import java.util.Scanner;

/**
 * bgcghg
 */
public class bgcghg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jumlahKopi;
        int jumlahTeh;
        int jumlahRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100;
        double totalHarga;
        double nominalBayar;

        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jumlahKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jumlahTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jumlahRoti = input.nextInt();

        totalHarga = (jumlahKopi * hargaKopi) + (jumlahTeh * hargaTeh) + (jumlahRoti * hargaRoti);

        nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jumlahKopi + " kopi," + " " +  jumlahTeh + " teh," + " " + jumlahRoti + " roti");
        System.out.println("Nominal bayar Rp " + nominalBayar);
        
    }
}
import java.util.Scanner;

/**
 * Siakad17
 */
public class Siakad17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen : ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian : ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        System.out.println("Mahasiswa dengan nama  " + nama + "  (NIM " +  nim + ")" + " kelas " + kelas + " nomor absen "  + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

    }
}
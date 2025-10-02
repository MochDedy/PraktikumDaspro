package jobsheet5;
import java.util.Scanner;

public class ifCetakKRS14 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("--- Cetak KRS Siakad ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = input.nextBoolean();

        if (uktLunas) {
            System.out.println("\nPembayaran UKT terverifikasi!");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        }
    }
}

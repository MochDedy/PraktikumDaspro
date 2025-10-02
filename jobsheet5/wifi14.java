package jobsheet5;

import java.util.Scanner;

public class wifi14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan pengguna (dosen/mahasiswa): ");
        String pengguna = input.nextLine();

        switch (pengguna) {
            case "dosen":
                System.out.println("Akses wifi diberikan (dosen)");
                break;
            case "mahasiswa":
                System.out.print("Masukkan jumlah SKS: ");
                int sks = input.nextInt();

                if (sks >= 12) {
                    System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
                } else {
                    System.out.println("Akses ditolak, SKS kurang dari 12");
                }
                break;
            default:
                System.out.println("Akses ditolak");
        }
    }
}

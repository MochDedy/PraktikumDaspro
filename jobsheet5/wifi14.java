package jobsheet5;

import java.util.Scanner;

public class wifi14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan pengguna (dosen/mahasiswa): ");
        String pengguna = input.nextLine();

        if (pengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Akses wifi diberikan (dosen)");
        } else if (pengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS anda: ");
            int sks = input.nextInt();
            if (sks >= 12) {
                System.out.println("Akses Wifi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, jumlah SKS kamu kurang dari 12!");
            }
        } else {
            System.out.println("Akses ditolak");
        }
    }
}
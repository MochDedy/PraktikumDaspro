package jobsheet5;

import java.util.Scanner;

public class perpustakaan14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah membawa kartu mahasiswa? (true/false): ");
        boolean kartu = sc.nextBoolean();

        System.out.print("Apakah sudah registrasi online? (true/false): ");
        boolean registrasi = sc.nextBoolean();

        if (kartu || registrasi) {
            System.out.println("Mahasiswa boleh masuk");
        } else {
            System.out.println("Mahasiswa tidak boleh masuk");
        }
    }
}

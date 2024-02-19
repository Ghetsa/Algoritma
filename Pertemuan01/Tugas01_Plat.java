package Algoritma.Pertemuan01;

import java.util.Scanner;

public class Tugas01_Plat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] kota = {
                { "B", "A", "N", "T", "E", "N" },
                { "J", "A", "K", "A", "R", "T", "A" },
                { "B", "A", "N", "D", "U", "N", "G" },
                { "C", "I", "R", "E", "B", "O", "N" },
                { "B", "O", "G", "O", "R" },
                { "P", "E", "K", "A", "L", "O", "N", "G", "A", "N" },
                { "S", "E", "M", "A", "R", "A", "N", "G" },
                { "S", "U", "R", "A", "B", "A", "Y", "A" },
                { "M", "A", "L", "A", "N", "G" },
                { "T", "E", "G", "A", "L" }
        };

        String[] hurufPlat = { "A", "B", "D", "E", "F", "G", "H", "L", "N", "T" };

        System.out.println("=========================================");
        System.out.println("|         KODE HURUF PLAT NOMOR         |");
        System.out.println("-----------------------------------------");
        System.out.print("| ");
        for (int i = 0; i < hurufPlat.length; i++) {
            System.out.print(hurufPlat[i] + " | ");
        }
        System.out.println();
        System.out.println("=========================================");
        System.out.print("Masukkan Kode Huruf Kota: ");
        String huruf = input.nextLine();

        int plat = -1;
        for (int i = 0; i < hurufPlat.length; i++) {
            if (huruf.equalsIgnoreCase(hurufPlat[i])) {
                plat = i;
                break;
            }
        }
        if (plat != -1) {
            System.out.println("Plat: " + hurufPlat[plat]);
            System.out.print("Kota: ");
            for (int i = 0; i < kota[plat].length; i++) {
                if (kota[plat][i] != null) {

                    System.out.print(kota[plat][i]);
                }
            }
        } else {
            System.out.println("KODE HURUF ANDA SALAH!!");
            System.exit(0);
        }

        input.close();
    }
}

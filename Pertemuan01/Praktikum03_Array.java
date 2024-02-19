package Algoritma.Pertemuan01;

import java.util.Scanner;

public class Praktikum03_Array {
    public static void main(String[] args) {
        String[] mataKuliah = { "PANCASILA", "KTI", "CTPS", "MATDAS", "BING", "DASPRO", "PRAKDASPRO", "K3" };
        int[] nilaiAngka = new int[mataKuliah.length];
        int[] sks = new int[mataKuliah.length];

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("|    PROGRAM MENGHITUNG IP SEMESTER POLINEMA    |");
        System.out.println("=================================================");
        for (int i = 0; i < mataKuliah.length; i++) {
            do {
                System.out.print("| Masukkan Nilai " + mataKuliah[i] + " : ");
                nilaiAngka[i] = scanner.nextInt();

                if (nilaiAngka[i] < 0 || nilaiAngka[i] > 100) {
                    System.out.println("Nilai yang anda masukkan tidak VALID");
                }
            } while (nilaiAngka[i] < 0 || nilaiAngka[i] > 100);

            System.out.print("| SKS: ");
            sks[i] = scanner.nextInt();
        }

        int jumlahMK = mataKuliah.length;

        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];
        for (int i = 0; i < jumlahMK; i++) {
            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }
        }

        double IP;
        double totalNilaiMK = 0;
        int totalSKS = 0;
        for (int i = 0; i < nilaiAngka.length; i++) {
            totalNilaiMK += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }
        IP = totalNilaiMK / totalSKS;
        System.out.println("=================================================================================");
        System.out.printf("| %-20s| %-10s\t| %-15s| %-20s |%n", "MATA KULIAH", "NILAI MATKUL", "NILAI HURUF",
                "BOBOT NILAI");
        System.out.println("---------------------------------------------------------------------------------");

        for (int i = 0; i < nilaiAngka.length; i++) {
            System.out.printf("| %-20s| %-10d\t| %-15s| %-20.2f |%n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i],
                    bobotNilai[i]);

        }
        System.out.println("=================================================================================");

        System.out.println("Total SKS: " + totalSKS);
        System.out.printf("IP: %.2f%n", IP);
    }

}

package Algoritma.Pertemuan01;

import java.util.Scanner;

public class Tugas02_Rumus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jarak, waktu, kecepatan;
        int menu = 0;
        do {
            System.out.println("============================");
            System.out.println("|      SELAMAT DATANG      |");
            System.out.println("----------------------------");
            System.out.println("| 1. Kecepatan             |");
            System.out.println("| 2. Jarak                 |");
            System.out.println("| 3. Waktu                 |");
            System.out.println("| 0. Keluar                |");
            System.out.println("============================");
            System.out.print("Pilih Rumus: ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("============================");
                    System.out.println("|      HITUNG KECEPATAN    |");
                    System.out.println("============================");
                    System.out.print("Masukkan Jarak(Km)  : ");
                    jarak = input.nextDouble();
                    System.out.print("Masukkan Waktu(Jam) : ");
                    waktu = input.nextDouble();

                    kecepatan = hitungKecepatan(jarak, waktu);
                    System.out.println("============================");
                    System.out.println("Kecepatan : " + kecepatan + " Km/Jam");
                    System.out.println("============================");

                    break;
                case 2:
                    System.out.println("============================");
                    System.out.println("|        HITUNG JARAK      |");
                    System.out.println("============================");
                    System.out.print("Masukkan Kecepatan(Km/Jam)  : ");
                    kecepatan = input.nextDouble();
                    System.out.print("Masukkan Waktu(Jam) : ");
                    waktu = input.nextDouble();

                    jarak = hitungJarak(kecepatan, waktu);
                    System.out.println("============================");
                    System.out.println("Jarak : " + jarak + " Km");
                    System.out.println("============================");

                    break;
                case 3:
                    System.out.println("============================");
                    System.out.println("|        HITUNG WAKTU      |");
                    System.out.println("============================");
                    System.out.print("Masukkan Jarak(Km)  : ");
                    jarak = input.nextDouble();
                    System.out.print("Masukkan Kecepatan(Km/Jam) : ");
                    kecepatan = input.nextDouble();

                    waktu = hitungWaktu(jarak, kecepatan);
                    System.out.println("============================");
                    System.out.println("Waktu : " + waktu + " Jam");
                    System.out.println("============================");

                    break;

            }
        } while (menu != 0);

    }

    static double hitungKecepatan(double jarak, double waktu) {
        double kecepatan;
        kecepatan = jarak / waktu;
        return kecepatan;
    }

    static double hitungJarak(double kecepatan, double waktu) {
        double jarak;
        jarak = kecepatan * waktu;
        return jarak;
    }

    static double hitungWaktu(double jarak, double kecepatan) {
        double waktu;
        waktu = jarak / kecepatan;
        return waktu;
    }
}

package Algoritma.Pertemuan01;

import java.util.Scanner;

public class Praktikum04_Fungsi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        do {
            System.out.println("===================================");
            System.out.println("|           SELAMAT DATANG        |");
            System.out.println("-----------------------------------");
            System.out.println("| Menu:                           |");
            System.out.println("| 1. Total Pemasukan Toko Cabang  |");
            System.out.println("| 2. Stok Toko Cabang             |");
            System.out.println("| 0. Keluar                       |");
            System.out.println("===================================");
            System.out.print("Pilih Menu: ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    int toko = 0;

                    System.out.println("===================================");
                    System.out.println("|      PEMASUKAN TOKO CABANG      |");
                    System.out.println("-----------------------------------");
                    System.out.println("| Toko:                           |");
                    System.out.println("| 1. RoyalGarden 1                |");
                    System.out.println("| 2. RoyalGarden 2                |");
                    System.out.println("| 3. RoyalGarden 3                |");
                    System.out.println("| 4. RoyalGarden 4                |");
                    System.out.println("| 0. Kembali                      |");
                    System.out.println("===================================");
                    System.out.print("Pilih Toko: ");
                    toko = input.nextInt();

                    System.out.println("=========================================");
                    System.out.println("| Toko            : RoyalGarden " + toko + "\t|");
                    System.out.println("| Total Pemasukan : " + PemasukanToko(toko) + "\t\t|");
                    System.out.println("=========================================");

                    break;

                case 2:
                    System.out.println("===================================");
                    System.out.println("|         STOK TOKO CABANG        |");
                    System.out.println("-----------------------------------");
                    System.out.println("| Toko:                           |");
                    System.out.println("| 1. RoyalGarden 1                |");
                    System.out.println("| 2. RoyalGarden 2                |");
                    System.out.println("| 3. RoyalGarden 3                |");
                    System.out.println("| 4. RoyalGarden 4                |");
                    System.out.println("===================================");
                    System.out.print("Pilih Toko: ");
                    int cabang = input.nextInt();

                    System.out.println("=========================================================================");
                    System.out.println("| Toko            : RoyalGarden " + cabang + "\t\t\t\t\t|");
                    System.out.println(
                            "| Stok Awal       : " + tanaman[0] + ":" + jmlTanaman[cabang - 1][0] + ", " + tanaman[1]
                                    + ":"
                                    + jmlTanaman[cabang - 1][1] + ", " + tanaman[2] + ":" + jmlTanaman[cabang - 1][2]
                                    + ", " + tanaman[3] + ":" + jmlTanaman[cabang - 1][3] + "\t\t|");

                    if (cabang == 4) {
                        jmlTanaman[3][0] -= 1; // Aglonema
                        jmlTanaman[3][1] -= 2; // Keladi
                        jmlTanaman[3][3] -= 5; // Mawar
                        System.out.println(
                                "| Stok Berkurang  : Aglonema: -1" + ", Keladi: -2" + ", Alocasia: -0" + ", Mawar: -5"
                                        + "\t|");
                        System.out.println(
                                "| Stok Sekarang   : Aglonema:" + jmlTanaman[cabang - 1][0] + ", Keladi:"
                                        + jmlTanaman[cabang - 1][1] + ", Alocasia:" + jmlTanaman[cabang - 1][2]
                                        + ", Mawar:" + jmlTanaman[cabang - 1][3] + "\t\t|");

                    } else {
                        System.out.println(
                                "| Stok Sekarang   : Aglonema:" + jmlTanaman[cabang - 1][0] + ", Keladi:"
                                        + jmlTanaman[cabang - 1][1] + ", Alocasia:" + jmlTanaman[cabang - 1][2]
                                        + ", Mawar:" + jmlTanaman[cabang - 1][3] + "\t\t|");

                    }
                    System.out.println("=========================================================================");

                    break;

                default:
                    break;
            }

        } while (menu != 0);
    }

    static String[] taman = {
            "RoyalGarden 1",
            "RoyalGarden 2",
            "RoyalGarden 3",
            "RoyalGarden 4"
    };
    static String[] tanaman = {
            "Aglonema",
            "Keladi",
            "Alocasia",
            "Mawar"
    };
    static int[][] jmlTanaman = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
    };
    static double[] harga = {
            75000,
            50000,
            60000,
            10000
    };

    static int PemasukanToko(int taman) {
        int pendapatan = 0;
        int cabang = taman;
        cabang -= 1;
        for (int i = 0; i < tanaman.length; i++) {
            pendapatan += (harga[i] * jmlTanaman[cabang][i]);
        }
        return pendapatan;
    }
}

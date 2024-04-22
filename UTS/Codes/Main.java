package Algoritma.UTS.Codes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean stop = true;
        int posisi;
        DataPenjualan data = new DataPenjualan();
        int jmlData = 17;

        System.out.println("----------------------------------------------");
        System.out.println("|   SELAMAT DATANG DI PENGECEKAN PENJUALAN   |");
        System.out.println("----------------------------------------------");

        do {
            System.out.println("==============================================");
            System.out.println("| Menu Utama                                 |");
            System.out.println("| 1. Tampilkan Semua Data Penjualan          |");
            System.out.println("| 2. Cari Data Penjualan                     |");
            System.out.println("| 3. Urutkan Data Penjualan                  |");
            System.out.println("| 0. Keluar                                  |");
            System.out.println("----------------------------------------------");
            System.out.print("| Pilih Menu (1/2/0) : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("==============================================");
                    System.out.println("|       Tampilkan Semua Data Penjualan       |");
                    data.tampil();
                    break;
                case 2:
                    System.out.println("----------------------------------------------");
                    System.out.println("| Pencarian Data:                            |");
                    System.out.print("| Masukkan Jumlah Penjualan yang Dicari: ");
                    int cari = sc.nextInt();

                    System.out.println("\n----------------------------------------------");
                    System.out.println("| Menggunakan Binary Search                  |");
                    posisi = data.FindBinarySearch(cari, 0, jmlData - 1);
                    data.TampilPosisi(cari, posisi);
                    data.TampilData(posisi);
                    System.out.println("----------------------------------------------\n");

                    break;

                case 3:
                    System.out.println("----------------------------------------------");
                    System.out.println("| Insertion Sort:                            |");
                    data.insertionSort();
                    data.tampil();
                    break;

                case 0:
                    stop = false;
                    break;

                default:
                    break;
            }
        } while (stop);
    }
}

package Algoritma.Pertemuan07.Praktikum.Latihan01;

import java.util.Scanner;

public class BukuMain12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        boolean stop = true;
        int posisi;

        PencarianBuku12 data = new PencarianBuku12();
        int jumBuku = 5;

        System.out.println("----------------------------------------------");
        System.out.println("| Masukkan Data Buku dari Kode Buku Terkecil |");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < jumBuku; i++) {
            System.out.print("| Kode Buku      : ");
            String kodeBuku = s1.nextLine();
            System.out.print("| Judul Buku     : ");
            String judulBuku = s1.nextLine();
            System.out.print("| Tahun Terbit   : ");
            int tahunTerbit = s.nextInt();
            s.nextLine();
            System.out.print("| Pengarang      : ");
            String pengarang = s1.nextLine();
            System.out.print("| Stok           : ");
            int stock = s.nextInt();

            Buku12 m = new Buku12(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
            System.out.println("----------------------------------------------");

        }

        System.out.println("==============================================");
        System.out.println("| Data Keseluruhan Buku:                     |");
        data.tampil();
        do {

            System.out.println("==============================================");
            System.out.println("| Menu Utama                                 |");
            System.out.println("| 1. Cari Data KODE BUKU                     |");
            System.out.println("| 0. Keluar                                  |");
            System.out.println("----------------------------------------------");
            System.out.print("| Pilih Menu (1/0) : ");
            int menu = s.nextInt();

            switch (menu) {

                case 1:

                    System.out.println("----------------------------------------------");
                    System.out.println("| Pencarian Data:                            |");
                    System.out.println("| Masukkan Kode Buku yang Dicari:            |");
                    System.out.print("| Kode Buku: ");
                    String cari = s1.nextLine();

                    boolean stop1 = true;
                    do {
                        System.out.println("==============================================");
                        System.out.println("| Metode:                                    |");
                        System.out.println("| 1. SEQUENTIAL SEARCH                       |");
                        System.out.println("| 2. BINARY SEARCH                           |");
                        System.out.println("| 0. Kembali                                 |");
                        System.out.println("----------------------------------------------");
                        System.out.print("| Pilih Metode (1/2/0) : ");
                        int metode1 = s.nextInt();

                        switch (metode1) {
                            case 1:
                                System.out.println("\n----------------------------------------------");
                                System.out.println("| Menggunakan Sequential Search              |");
                                posisi = data.FindSeqSearch(cari);
                                data.TampilPosisi(cari, posisi);
                                data.TampilData(cari, posisi);
                                System.out.println("----------------------------------------------\n");

                                break;
                            case 2:
                                System.out.println("\n----------------------------------------------");
                                System.out.println("| Menggunakan Binary Search                  |");
                                posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
                                data.TampilPosisi(cari, posisi);
                                data.TampilData(cari, posisi);
                                System.out.println("----------------------------------------------\n");

                                break;
                            case 0:
                                System.out.println("");
                                System.out.println("----------------------------------------------");
                                System.out.println("|            Kembali ke Menu Utama           |");
                                System.out.println("----------------------------------------------");
                                System.out.println("");
                                stop1 = false;
                                break;

                            default:
                                break;
                        }

                        // Buku12 dataBuku = data.FindBuku(cari);
                        // System.out.println("\n----------------------------------------------");
                        // System.out.println("| Menggunakan FindBuku |");
                        // System.out.println("----------------------------------------------");
                        // if (dataBuku != null) {
                        // dataBuku.tampilDataBuku();
                        // } else {
                        // System.out.println("Buku dengan kode " + cari + " tidak ditemukan.");
                        // }

                    } while (stop1);
                    break;

                case 0:
                    System.out.println("----------------------------------------------");
                    System.out.println("|         !!! KELUAR DARI PROGRAM !!!        |");
                    System.out.println("----------------------------------------------");
                    stop = false;
                    break;

                default:
                    System.out.println("!!! Inputan Anda Salah !!!");
                    break;
            }

        } while (stop);
    }
}

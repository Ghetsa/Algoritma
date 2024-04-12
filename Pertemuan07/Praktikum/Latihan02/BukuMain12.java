package Algoritma.Pertemuan07.Praktikum.Latihan02;

import java.util.Scanner;

public class BukuMain12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // untuk int
        Scanner s1 = new Scanner(System.in); // untuk String
        boolean stop = true;
        int posisi;

        PencarianBuku12 data = new PencarianBuku12();
        int jumBuku = 5;

        System.out.println("----------------------------------------------");
        System.out.println("| Masukkan Data Buku dari Kode Buku Terkecil |");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < jumBuku; i++) {
            System.out.print("| Kode Buku      : ");
            int kodeBuku = s.nextInt();
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
            System.out.println("| 2. Cari Data JUDUL BUKU                    |");
            System.out.println("| 0. Keluar                                  |");
            System.out.println("----------------------------------------------");
            System.out.print("| Pilih Menu (1/2/0) : ");
            int menu = s.nextInt();

            switch (menu) {

                case 1:

                    System.out.println("----------------------------------------------");
                    System.out.println("| Pencarian Data:                            |");
                    System.out.println("| Masukkan Kode Buku yang Dicari:            |");
                    System.out.print("| Kode Buku: ");
                    int cari = s.nextInt();

                    boolean stop1 = true;
                    do {
                        System.out.println("==============================================");
                        System.out.println("| Metode:                                    |");
                        System.out.println("| 1. SEQUENTIAL SEARCH                       |");
                        System.out.println("| 2. BINARY SEARCH                           |");
                        System.out.println("| 0. Kembali                                 |");
                        System.out.println("----------------------------------------------");
                        System.out.print("| Pilih Metode (1/2/0) : ");
                        int metode = s.nextInt();

                        switch (metode) {
                            case 1:
                                System.out.println("\n----------------------------------------------");
                                System.out.println("|        Menggunakan Sequential Search       |");
                                System.out.println("----------------------------------------------");
                                posisi = data.FindSeqSearch(cari);
                                data.TampilPosisi(posisi);
                                data.TampilData(posisi);
                                System.out.println("----------------------------------------------\n");

                                break;
                            case 2:
                                System.out.println("\n----------------------------------------------");
                                System.out.println("|          Menggunakan Binary Search         |");
                                System.out.println("----------------------------------------------");
                                posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
                                data.TampilPosisi(posisi);
                                data.TampilData(posisi);
                                System.out.println("----------------------------------------------\n");

                                break;
                            case 0:
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

                case 2:
                    System.out.println("----------------------------------------------");
                    System.out.println("| Pencarian Data:                            |");
                    System.out.println("| Masukkan Judul Buku yang Dicari:            |");
                    System.out.print("| Judul Buku: ");
                    String cari2 = s1.nextLine();
                    System.out.println("----------------------------------------------");

                    boolean stop2 = true;
                    do {
                        System.out.println("==============================================");
                        System.out.println("| Metode:                                    |");
                        System.out.println("| 1. SEQUENTIAL SEARCH                       |");
                        System.out.println("| 2. BINARY SEARCH                           |");
                        System.out.println("| 0. Kembali                                 |");
                        System.out.println("----------------------------------------------");
                        System.out.print("| Pilih Metode (1/2/0) : ");
                        int metode = s.nextInt();

                        switch (metode) {
                            case 1:
                                System.out.println("\n----------------------------------------------");
                                System.out.println("|        Menggunakan Sequential Search       |");
                                System.out.println("----------------------------------------------");
                                posisi = data.FindSeqJudul(cari2);
                                data.TampilPosisi(posisi);
                                data.TampilData(posisi);
                                System.out.println("----------------------------------------------\n");

                                break;

                            case 2:
                                System.out.println("\n----------------------------------------------");
                                System.out.println("|          Menggunakan Binary Search         |");
                                System.out.println("----------------------------------------------");
                                data.bubbleSort();
                                System.out.println("----------------------------------------------");
                                System.out.println("| Data Setelah Sorting Buku:                 |");
                                data.tampil();
                                System.out.println("----------------------------------------------");
                                System.out.println("\n----------------------------------------------");

                                posisi = data.FindBinaryJudul(cari2, 0, jumBuku - 1);
                                data.TampilPosisi(posisi);
                                data.TampilData(posisi);
                                System.out.println("----------------------------------------------\n");

                                break;

                            case 0:
                                System.out.println("");
                                stop2 = false;
                                break;
                            default:
                                break;
                        }

                    } while (stop2);
                    break;

                case 0:
                    stop = false;
                    break;

                default:
                    System.out.println("!!! Inputan Anda Salah !!!");

                    break;
            }

        } while (stop);
    }
}

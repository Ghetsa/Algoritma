package Algoritma.Pertemuan07.Percobaan.TestSearching;

import java.util.Scanner;

public class BukuMain12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku12 data = new PencarianBuku12();
        int jumBuku = 2;

        System.out.println("----------------------------------------------");
        System.out.println("| Masukkan Data Buku dari Kode Buku Terkecil |");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < jumBuku; i++) {
            System.out.print("| Kode Buku      : ");
            int kodeBuku = s.nextInt();
            s.nextLine();
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

        System.out.println("----------------------------------------------");
        System.out.println("| Data Keseluruhan Buku:                     |");
        data.tampil();

        System.out.println("----------------------------------------------");
        System.out.println("| Pencarian Data:                            |");
        System.out.println("| Masukkan Kode Buku yang Dicari:            |");
        System.out.print("| Kode Buku: ");
        int cari = s.nextInt();
        System.out.println("----------------------------------------------");

        System.out.println("\n----------------------------------------------");
        System.out.println("| Menggunakan Sequential Search              |");
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
        System.out.println("----------------------------------------------\n");

        System.out.println("----------------------------------------------");
        System.out.println("| Menggunakan Binary Search                  |");
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.TampilPosisi(cari, posisi);
        if (posisi != -1) {
            data.TampilData(cari, posisi);
        } else {
            System.out.println("----------------------------------------------");
            System.out.println("!!!          Data Tidak Ditemukan          !!!");
        }
        System.out.println("----------------------------------------------");

    }
}
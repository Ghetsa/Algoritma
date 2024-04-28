package Algoritma.Pertemuan08.Percobaan;

import java.util.Scanner;

public class Utama12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gudang12 gudang = new Gudang12(7);
        int jmlData = 7;
        boolean stop = true;
        int posisi;

        System.out.println("----------------------------------------------");
        System.out.println("|      SELAMAT DATANG DI GUDANG LILISYA      |");
        System.out.println("----------------------------------------------");

        while (true) {
            System.out.println("==============================================");
            System.out.println("| Menu Utama:                                |");
            System.out.println("| 1. Tambah Barang                           |");
            System.out.println("| 2. Ambil Barang                            |");
            System.out.println("| 3. Tampilkan Tumpukan Barang               |");
            System.out.println("| 4. Keluar                                  |");
            System.out.println("----------------------------------------------");
            System.out.print("| Pilih Menu (1/2/3/4) : ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("==============================================");
                    System.out.println("|             TAMBAHKAN DATA BARANG          |");
                    System.out.println("----------------------------------------------");
                    System.out.print("| Masukkan Kode Barang   : ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("| Masukkan Nama Barang   : ");
                    String nama = sc.nextLine();
                    System.out.print("| Masukkan Nama Kategori : ");
                    String kategori = sc.nextLine();

                    Barang12 barangBaru = new Barang12(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);

                    System.out.println("==============================================");
                    break;

                case 2:
                    gudang.ambilBarang();
                    break;

                case 3:
                    System.out.println("==============================================");
                    gudang.tampilkanBarang();
                    break;

                case 4:

                    break;

                default:
                    System.out.println("!!! Inputan Anda Salah !!!");
                    break;
            }

        }
    }
}

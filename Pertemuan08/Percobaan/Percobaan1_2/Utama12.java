package Algoritma.Pertemuan08.Percobaan.Percobaan1_2;

import java.util.Scanner;

public class Utama12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        Gudang12 gudang = new Gudang12(7);
        boolean stop = true;

        System.out.println("----------------------------------------------");
        System.out.println("|      SELAMAT DATANG DI GUDANG LILISYA      |");
        System.out.println("----------------------------------------------");
        // System.out.print("| Masukkan jumlah tumpukan: ");
        // int jmlData = scs.nextInt();
        // Gudang12 gudang = new Gudang12(jmlData);
        while (stop) {
            System.out.println("==============================================");
            System.out.println("| Menu Utama:                                |");
            System.out.println("| 1. Tambah Barang                           |");
            System.out.println("| 2. Ambil Barang                            |");
            System.out.println("| 3. Tampilkan Tumpukan Barang               |");
            // System.out.println("| 4. Lihat Barang Teratas                    |");
            // System.out.println("| 5. Lihat Barang Terbawah                   |");
            // System.out.println("| 6. Cari Barang                             |");
            System.out.println("| 0. Keluar                                  |");
            System.out.println("----------------------------------------------");
            System.out.print("| Pilih Menu (1/2/3/0) : ");
            // System.out.print("| Pilih Menu (1/2/3/4/5/6/0) : ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("==============================================");
                    System.out.println("|             TAMBAHKAN DATA BARANG          |");
                    System.out.println("----------------------------------------------");
                    System.out.print("| Masukkan Kode Barang   : ");
                    int kode = scs.nextInt();
                    scs.nextLine();
                    System.out.print("| Masukkan Nama Barang   : ");
                    String nama = sc.nextLine();
                    System.out.print("| Masukkan Nama Kategori : ");
                    String kategori = sc.nextLine();

                    Barang12 barangBaru = new Barang12(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);

                    break;

                case 2:
                    gudang.ambilBarang();
                    break;

                case 3:
                    gudang.tampilkanBarang();
                    break;

                case 4:
                    gudang.lihatBarangTeratas();
                    break;

                case 5:
                    gudang.lihatBarangTerbawah();
                    break;

                case 6:
                    boolean stopp = true;
                    while (stopp) {

                        System.out.println("==============================================");
                        System.out.println("|               PENCARIAN BARANG             |");
                        System.out.println("----------------------------------------------");
                        System.out.println("| Pilih :                                    |");
                        System.out.println("| 1. Berdasarkan Kode Barang                 |");
                        System.out.println("| 2. Berdasarkan Nama Barang                 |");
                        System.out.println("| 0. Kembali                                 |");
                        System.out.println("----------------------------------------------");
                        System.out.print("| Pilih Menu (1/2/0) : ");
                        int pilih = scs.nextInt();
                        scs.nextLine();
                        switch (pilih) {
                            case 1:
                                System.out.println("==============================================");
                                System.out.println("|               CARI KODE BARANG             |");
                                System.out.println("----------------------------------------------");
                                System.out.print("| Masukkan Kode Barang  : ");
                                int cariKode = scs.nextInt();
                                scs.nextLine();
                                // gudang.FindSeqKode(cariKode);
                                int posisiKode = gudang.FindBinarySearchKode(cariKode, 0, gudang.top);
                                gudang.Tampil(posisiKode);
                                break;

                            case 2:
                                System.out.println("==============================================");
                                System.out.println("|               CARI NAMA BARANG             |");
                                System.out.println("----------------------------------------------");
                                System.out.print("| Masukkan Kode Barang  : ");
                                String cariNama = sc.nextLine();
                                // gudang.FindSeqNama(cariNama);
                                int posisiNama = gudang.FindBinarySearchNama(cariNama, 0, gudang.top);
                                gudang.Tampil(posisiNama);
                                break;

                            case 0:
                                System.out.println("----------------------------------------------");
                                System.out.println("|         !! KEMBALI KE MENU UTAMA !!        |");
                                System.out.println("----------------------------------------------");

                                stopp = false;
                                break;

                            default:
                                break;
                        }
                    }
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

        }
    }
}

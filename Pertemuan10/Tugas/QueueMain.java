package Algoritma.Pertemuan10.Tugas;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("==============================================");
        System.out.println("| Masukkan operasi yang diinginkan:          |");
        System.out.println("| 1. Antrian Baru                            |");
        System.out.println("| 2. Antrian Keluar                          |");
        System.out.println("| 3. Cek Semua Antrian                       |");
        System.out.println("| 4. Cek Antrian Terdepan                    |");
        System.out.println("| 5. Cek Antrian Terbelakang                 |");
        System.out.println("| 6. Cek Posisi                              |");
        System.out.println("| 7. Hapus Semua Antrian                     |");
        System.out.println("| 0. Keluar                                  |");
        System.out.println("----------------------------------------------");
        System.out.print("| Pilih Menu (1/2/3/4/5/6/0) : ");

    }

    public static void main(String[] args) {
        System.out.println("----------------------------------------------");
        System.out.println("|    SELAMAT DATANG DI MANAGEMENT PEMBELI    |");
        System.out.println("----------------------------------------------");

        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in); // String
        System.out.print("| Masukkan kapasitas queue: ");
        int jml = sc.nextInt();
        Queue antrian = new Queue(jml);
        boolean stop = true;
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            System.out.println("----------------------------------------------");

            switch (pilih) {
                case 1:
                    System.out.println("==============================================");
                    System.out.println("|            TAMBAHKAN DATA PEMBELI          |");
                    System.out.println("----------------------------------------------");
                    System.out.print("| Masukkan Nama Pembeli   : ");
                    String nama = scs.nextLine();
                    System.out.print("| Masukkan No.HP Pembeli  : ");
                    int noHP = sc.nextInt();
                    Pembeli nb = new Pembeli(nama, noHP);
                    sc.nextLine();
                    antrian.enqueue(nb);

                    break;

                case 2:
                    System.out.println("==============================================");
                    System.out.println("|                ANTRIAN KELUAR              |");
                    System.out.println("----------------------------------------------");

                    Pembeli data = antrian.dequeue();
                    if (!"".equals(data.nama) && data.noHP != 0) {
                        System.out.printf("|%-43s %s|%n", " Antrian keluar   | " + data.nama + " [" + data.noHP + "]",
                                "");
                        break;
                    }
                    System.out.println("==============================================");

                case 3:
                    System.out.println("==============================================");
                    System.out.println("|                DAFTAR ANTRIAN              |");
                    System.out.println("----------------------------------------------");

                    antrian.daftarPembeli();
                    break;

                case 4:
                    System.out.println("==============================================");
                    System.out.println("|               ANTRIAN TERDEPAN             |");
                    System.out.println("----------------------------------------------");

                    antrian.peek();
                    break;

                case 5:
                    System.out.println("==============================================");
                    System.out.println("|             ANTRIAN TERBELAKANG            |");
                    System.out.println("----------------------------------------------");

                    antrian.peekRear();
                    break;

                case 6:
                    System.out.println("==============================================");
                    System.out.println("|          PENCARIAN ANTRIAN PEMBELI         |");
                    System.out.println("----------------------------------------------");
                    System.out.print("| Masukkan Nama Pembeli: ");
                    String namaPembeli = scs.nextLine();
                    antrian.peekPosition(namaPembeli);
                    break;

                case 7:
                    System.out.println("==============================================");
                    System.out.println("|          BERSIHKAN ANTRIAN PEMBELI         |");
                    System.out.println("----------------------------------------------");
                    System.out.println("| Yakin ingin menghapus semua antrian??      |");
                    System.out.println("| 1. Ya                                      |");
                    System.out.println("| 0. Tidak                                   |");
                    System.out.println("----------------------------------------------");
                    System.out.print("| Konfirmasi (1/0) : ");
                    int konf = sc.nextInt();
                    System.out.println("----------------------------------------------");
                    if (konf == 1) {
                        antrian.clear();
                    }else{
                        System.out.println("|           KEMBALI KE MENU UTAMA            |");
                    }
                    System.out.println("----------------------------------------------");

                    break;

                case 0:
                    System.out.println("==============================================");
                    System.out.println("|      !!! ANDA KELUAR DARI PROGRAM !!!      |");
                    System.out.println("==============================================");

                    stop = false;
                    break;

                default:
                    System.out.println("==============================================");
                    System.out.println("|         !!! INPUTAN ANDA SALAH !!!         |");
                    System.out.println("==============================================");
                    break;
            }
        } while (stop);

    }
}

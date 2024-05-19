package Algoritma.Pertemuan12.Praktikum.Praktikum1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in); // String
        boolean stop = true;
        String nama;
        int nomor;

        System.out.println("----------------------------------------------");
        System.out.println("|        PENGANTRI VAKSIN EXTRAVAGANZA       |");
        System.out.println("----------------------------------------------");

        do {
            System.out.println("==============================================");
            System.out.println("|                 MENU UTAMA                 |");
            System.out.println("----------------------------------------------");
            System.out.println("| 1. Tambah Data Penerima Vaksin             |");
            System.out.println("| 2. Hapus Data Pengantri Vaksin             |");
            System.out.println("| 3. Daftar Penerima Vaksin                  |");
            System.out.println("| 0. Keluar                                  |");
            System.out.println("----------------------------------------------");
            System.out.print("| Pilih Menu (1/2/3/0) : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("==============================================");
                    System.out.println("|           TAMBAH ANTRIAN VAKSIN            |");
                    System.out.println("----------------------------------------------");
                    System.out.print("| Masukkan NOMOR : ");
                    nomor = sc.nextInt();
                    System.out.print("| Masukkan NAMA  : ");
                    nama = scs.nextLine();
                    dll.addLast(new Antrian(nomor, nama));
                    break;
                case 2:
                    System.out.println("==============================================");
                    System.out.println("|            HAPUS ANTRIAN VAKSIN            |");
                    System.out.println("----------------------------------------------");
                    dll.removeFirst();
                    System.out.println("==============================================");

                    break;
                case 3:
                    dll.print();
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

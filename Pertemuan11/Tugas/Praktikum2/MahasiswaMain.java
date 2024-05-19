package Algoritma.Pertemuan11.Tugas.Praktikum2;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in); // String
        boolean stop = true;

        System.out.println("----------------------------------------------");
        System.out.println("|     SELAMAT DATANG DI ANTRIAN MAHASISWA    |");
        System.out.println("----------------------------------------------");

        do {
            System.out.println("==============================================");
            System.out.println("|                 MENU UTAMA                 |");
            System.out.println("----------------------------------------------");
            System.out.println("| 1. Tambah Antrian Mahasiswa                |");
            System.out.println("| 2. Hapus Antrian Mahasiswa                 |");
            System.out.println("| 3. Tampilkan Semua Antrian                 |");
            System.out.println("| 4. Cek Posisi                              |");
            System.out.println("| 5. Cek Antrian NIM                         |");
            System.out.println("| 0. Keluar                                  |");
            System.out.println("----------------------------------------------");
            System.out.print("| Pilih Menu (1/2/3/4/5/0) : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    int nim;
                    String nama;
                    boolean stop1 = true;
                    do {
                        System.out.println("==============================================");
                        System.out.println("|               TAMBAH ANTRIAN               |");
                        System.out.println("----------------------------------------------");
                        System.out.println("| 1. Tambah Antrian Pertama                  |");
                        System.out.println("| 2. Tambah Antrian Terakhir                 |");
                        System.out.println("| 3. Tambah Antrian Setelah Data             |");
                        System.out.println("| 4. Tambah Antrian Berdasarkan Index        |");
                        System.out.println("| 5. Tampilkan Semua Antrian                 |");
                        System.out.println("| 0. Kembali                                 |");
                        System.out.println("----------------------------------------------");
                        System.out.print("| Pilih Menu (1/2/3/4/0) : ");
                        int tambah = sc.nextInt();

                        switch (tambah) {
                            case 1:
                                singLL.print();

                                System.out.println("==============================================");
                                System.out.println("|           TAMBAH ANTRIAN PERTAMA           |");
                                System.out.println("----------------------------------------------");
                                System.out.print("| Masukkan NIM   : ");
                                nim = sc.nextInt();
                                System.out.print("| Masukkan NAMA  : ");
                                nama = scs.nextLine();
                                singLL.addFirst(new Mahasiswa(nim, nama));
                                break;
                            case 2:
                                singLL.print();

                                System.out.println("==============================================");
                                System.out.println("|          TAMBAH ANTRIAN TERAKHIR           |");
                                System.out.println("----------------------------------------------");
                                System.out.print("| Masukkan NIM   : ");
                                nim = sc.nextInt();
                                System.out.print("| Masukkan NAMA  : ");
                                nama = scs.nextLine();
                                singLL.addLast(new Mahasiswa(nim, nama));
                                break;
                            case 3:
                                singLL.print();

                                System.out.println("==============================================");
                                System.out.println("|            TAMBAH ANTRIAN AFTER            |");
                                System.out.println("----------------------------------------------");
                                System.out.print("| Masukkan Antrian Setelah NIM   : ");
                                int key = sc.nextInt();
                                System.out.print("| Masukkan NIM   : ");
                                nim = sc.nextInt();
                                System.out.print("| Masukkan NAMA  : ");
                                nama = scs.nextLine();
                                singLL.insertAfter(key, new Mahasiswa(nim, nama));
                                break;
                            case 4:
                                singLL.print();

                                System.out.println("==============================================");
                                System.out.println("|            TAMBAH ANTRIAN INDEX            |");
                                System.out.println("----------------------------------------------");
                                System.out.print("| Masukkan Antrian Pada INDEX ke-   : ");
                                int index = sc.nextInt();
                                System.out.print("| Masukkan NIM   : ");
                                nim = sc.nextInt();
                                System.out.print("| Masukkan NAMA  : ");
                                nama = scs.nextLine();
                                singLL.insertAt(index, new Mahasiswa(nim, nama));
                                break;
                            case 5:
                                singLL.print();
                                break;
                            case 0:
                                System.out.println("==============================================");
                                System.out.println("|         !! KEMBALI KE MENU UTAMA !!        |");
                                System.out.println("==============================================");

                                stop1 = false;
                                break;

                            default:
                                System.out.println("==============================================");
                                System.out.println("|     !! INPUT TIDAK VALID, COBA LAGI !!     |");
                                System.out.println("==============================================");
                                break;
                        }

                    } while (stop1);
                    break;

                case 2:
                    boolean stop2 = true;
                    do {
                        System.out.println("==============================================");
                        System.out.println("|               TAMBAH ANTRIAN               |");
                        System.out.println("----------------------------------------------");
                        System.out.println("| 1. Hapus Antrian Pertama                   |");
                        System.out.println("| 2. Hapus Antrian Terakhir                  |");
                        System.out.println("| 3. Hapus Antrian Berdasarkan NIM           |");
                        System.out.println("| 4. Hapus Antrian Berdasarkan Index         |");
                        System.out.println("| 5. Tampilkan Semua Antrian                 |");
                        System.out.println("| 0. Kembali                                 |");
                        System.out.println("----------------------------------------------");
                        System.out.print("| Pilih Menu (1/2/3/4/5/0) : ");
                        int hapus = sc.nextInt();
                        switch (hapus) {
                            case 1:
                                System.out.println("==============================================");
                                System.out.println("|            HAPUS ANTRIAN PERTAMA           |");
                                System.out.println("----------------------------------------------");
                                singLL.removeFirst();
                                singLL.print();

                                break;

                            case 2:
                                System.out.println("==============================================");
                                System.out.println("|           HAPUS ANTRIAN TERAKHIR           |");
                                System.out.println("----------------------------------------------");
                                singLL.removeLast();
                                singLL.print();

                                break;

                            case 3:
                                singLL.print();

                                System.out.println("==============================================");
                                System.out.println("|        HAPUS ANTRIAN BERDASARKAN NIM       |");
                                System.out.println("----------------------------------------------");
                                System.out.print("| Masukkan NIM Mahasiswa: ");
                                int key = sc.nextInt();
                                singLL.remove(key);
                                singLL.print();

                                break;

                            case 4:
                                singLL.print();

                                System.out.println("==============================================");
                                System.out.println("|       HAPUS ANTRIAN BERDASARKAN INDEX      |");
                                System.out.println("----------------------------------------------");
                                System.out.print("| Masukkan INDEX Antrian (mulai 0): ");
                                int index = sc.nextInt();
                                singLL.removeAt(index);
                                singLL.print();

                                break;

                            case 5:
                                singLL.print();
                                break;

                            case 0:
                                System.out.println("==============================================");
                                System.out.println("|         !! KEMBALI KE MENU UTAMA !!        |");
                                System.out.println("==============================================");

                                stop2 = false;
                                break;

                            default:
                                System.out.println("==============================================");
                                System.out.println("|     !! INPUT TIDAK VALID, COBA LAGI !!     |");
                                System.out.println("==============================================");

                                break;
                        }
                    } while (stop2);
                    break;

                case 3:
                    singLL.print();

                    break;

                case 4:
                    System.out.println("==============================================");
                    System.out.println("|        CEK ANTRIAN BERDASARKAN INDEX       |");
                    System.out.println("----------------------------------------------");
                    System.out.print("| Masukkan INDEX Antrian (mulai 0): ");
                    int index = sc.nextInt();
                    System.out.println("----------------------------------------------");

                    System.out.printf("|%-43s %s|%n",
                            " Data index ke-" + index + "   | " + " " + singLL.getData(index).nama + "",
                            "");
                    System.out.println("----------------------------------------------");

                    break;

                case 5:
                    System.out.println("==============================================");
                    System.out.println("|         CEK ANTRIAN BERDASARKAN NIM        |");
                    System.out.println("----------------------------------------------");
                    System.out.print("| Masukkan NIM Mahasiswa: ");
                    int key = sc.nextInt();
                    if (singLL.indexOf(key) != -1) {
                        System.out.println("----------------------------------------------");
                        System.out.printf("| %-8s| %-8s| %-10s| %-10s %s|%n", "ANTRIAN", "INDEX", "NIM", "NAMA", "");
                        System.out.println("----------------------------------------------");
                        System.out.printf("| %-8s| %-8s| %-10s| %-10s %s|%n", (singLL.indexOf(key) + 1),
                                singLL.indexOf(key), key, singLL.getData(singLL.indexOf(key)).nama, "");

                    } else {
                        System.out.println("----------------------------------------------");
                        System.out.println("|         !!!DATA TIDAK DITEMUKAN!!!         |");

                    }
                    System.out.println("----------------------------------------------");

                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    break;
            }
        } while (stop);
    }
}
package Algoritma.Pertemuan10.Percobaan.Percobaan2;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("==============================================");
        System.out.println("| Masukkan operasi yang diinginkan:          |");
        System.out.println("| 1. Antrian Baru                            |");
        System.out.println("| 2. Antrian Keluar                          |");
        System.out.println("| 3. Cek Antrian Terdepan                    |");
        System.out.println("| 4. Cek Semua Antrian                       |");
        System.out.println("| 5. Cek Antrian paling belakang              |");
        System.out.println("----------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        System.out.print("| Masukkan kapasitas queue: ");
        int jml = sc.nextInt();
        Queue antrian = new Queue(jml); // Buat objek Queue
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("| No Rekening: ");
                    String norek = scs.nextLine();
                    System.out.print("| Nama: ");
                    String nama = scs.nextLine();
                    System.out.print("| Alamat: ");
                    String alamat = scs.nextLine();
                    System.out.print("| Umur: ");
                    int umur = sc.nextInt();
                    System.out.print("| Saldo: ");
                    double saldo = sc.nextInt();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antrian.enqueue(nb);

                    break;

                case 2:
                    Nasabah data = antrian.dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("| Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo + "|");
                        break;
                    }

                case 3:
                    antrian.peek();
                    break;

                case 4:
                    antrian.print();
                    break;

                case 5:
                    antrian.peekRear();
                    break;

                default:
                    break;
            }
        } while (pilih != 0);

    }
}

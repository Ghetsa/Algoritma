package Algoritma.Pertemuan06.Praktikum;

import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean stop = true;
        HotelService daftar = new HotelService();
        Hotel h1 = new Hotel("Mutiara", "Tuban", 100000, (byte) 3);
        Hotel h2 = new Hotel("Kembang", "Malang", 300000, (byte) 2);
        Hotel h3 = new Hotel("Pancakarsa", "Blitar", 500000, (byte) 5);
        Hotel h4 = new Hotel("Halimah", "Makkah", 350000, (byte) 5);
        Hotel h5 = new Hotel("Putra Bumi", "Jogja", 10000, (byte) 8);

        daftar.tambah(h1);
        daftar.tambah(h2);
        daftar.tambah(h3);
        daftar.tambah(h4);
        daftar.tambah(h5);

        System.out.println("==============================================");
        System.out.println("|          Data Hotel Belum Disorting        |");
        System.out.println("----------------------------------------------");
        daftar.tampilAll();
        do {
            System.out.println("Kriteria Sorting: ");
            System.out.println("1. Berdasarkan Harga");
            System.out.println("2. Berdasarkan Bintang");
            System.out.println("0. Keluar");
            System.out.print("Pilih (1/2/0): ");
            int krit = sc.nextInt();

            switch (krit) {
                case 1:
                    boolean stop1 = true;
                    do {
                        System.out.println("Metode Sorting:");
                        System.out.println("1. Bubble Sort");
                        System.out.println("2. Selection Sort");
                        System.out.println("0. Kembali");
                        System.out.print("Pilih Metode (1/2/0): ");
                        int metode1 = sc.nextInt();

                        switch (metode1) {
                            case 1:
                                System.out.println("==============================================");
                                System.out.println("|   Data Hotel Disorting Berdasarkan Harga   |");
                                System.out.println("----------------------------------------------");
                                System.out.println("|                 BUBBLE SORT                |");
                                System.out.println("----------------------------------------------");
                                daftar.bubbleSort("harga");
                                daftar.tampilAll();
                                System.out.println("==============================================");
                                break;

                            case 2:
                                System.out.println("==============================================");
                                System.out.println("|   Data Hotel Disorting Berdasarkan Harga   |");
                                System.out.println("----------------------------------------------");
                                System.out.println("|                SELECTION SORT              |");
                                System.out.println("----------------------------------------------");
                                daftar.selectionSort("harga");
                                daftar.tampilAll();
                                System.out.println("==============================================");
                                break;

                            case 0:
                                System.out.println("-------------------------");
                                System.out.println("| Kembali ke Menu Utama |");
                                System.out.println("-------------------------");
                                stop1 = false;
                                break;
                            default:
                                System.out.println("!!! Inputan Anda Salah !!!");
                                break;
                        }

                    } while (stop1);
                    break;

                case 2:
                    boolean stop2 = true;
                    do {
                        System.out.println("Metode Sorting:");
                        System.out.println("1. Bubble Sort");
                        System.out.println("2. Selection Sort");
                        System.out.println("0. Kembali");
                        System.out.print("Pilih Metode (1/2/0):");
                        int metode2 = sc.nextInt();

                        switch (metode2) {
                            case 1:
                                System.out.println("==============================================");
                                System.out.println("|  Data Hotel Disorting Berdasarkan Bintang  |");
                                System.out.println("----------------------------------------------");
                                System.out.println("|                 BUBBLE SORT                |");
                                System.out.println("----------------------------------------------");
                                daftar.bubbleSort("bintang");
                                daftar.tampilAll();
                                System.out.println("==============================================");
                                break;
                            case 2:
                                System.out.println("==============================================");
                                System.out.println("|  Data Hotel Disorting Berdasarkan Bintang  |");
                                System.out.println("----------------------------------------------");
                                System.out.println("|                SELECTION SORT              |");
                                System.out.println("----------------------------------------------");
                                daftar.selectionSort("bintang");
                                daftar.tampilAll();
                                System.out.println("==============================================");
                                break;
                            case 0:
                                System.out.println("-------------------------");
                                System.out.println("| Kembali ke Menu Utama |");
                                System.out.println("-------------------------");
                                stop2 = false;
                                break;

                            default:
                                System.out.println("!!! Inputan Anda Salah !!!");
                                break;
                        }
                    } while (stop2);

                    break;

                case 0:
                    System.out.println("================================");
                    System.out.println("!!! ANDA KELUAR DARI PROGRAM !!!");
                    System.out.println("================================");
                    stop = false;
                    break;

                default:
                    System.out.println("!!! Inputan Anda Salah !!!");
                    break;
            }

        } while (stop);

    }
}

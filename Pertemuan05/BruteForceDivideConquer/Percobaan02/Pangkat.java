package Algoritma.Pertemuan05.BruteForceDivideConquer.Percobaan02;

import java.util.Scanner;

public class Pangkat {
    int nilai, pangkat;

    Pangkat(int angka, int pangkat) {
        this.nilai = angka;
        this.pangkat = pangkat;
    }

    int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil *= a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1) {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
            } else {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = sc.nextInt();
        int menu;
        Pangkat[] png = new Pangkat[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan: ");
            int angka = sc.nextInt();
            System.out.print("Masukkan nilai pangkat: ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(angka, pangkat);
        }
        do {
            System.out.println("==================================");

            System.out.println("Pilih metode:");
            System.out.println("1. Brute Force");
            System.out.println("2. Divide and Conquer");
            System.out.println("0. Keluar");
            System.out.print("Pilih (1/2/0): ");
            menu = sc.nextInt();
            
            System.out.println("----------------------------------");

            switch (menu) {
                case 1:
                    System.out.println("Hasil Pangkat - BRUTE FORCE");
                    for (int i = 0; i < elemen; i++) {
                        System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                                + png[i].pangkatBF(png[i].nilai, png[i].pangkat));

                    }
                    break;
                case 2:
                    System.out.println("Hasil Pangkat - DIVIDE AND CONQUER");
                    for (int i = 0; i < elemen; i++) {
                        System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                                + png[i].pangkatDC(png[i].nilai, png[i].pangkat));

                    }
                    break;

                case 0:
                    System.out.println("|    ANDA KELUAR DARI PROGRAM    |");
                    System.out.println("----------------------------------");
                    break;

                default:
                    System.out.println("Masukkan anda tidak valid");
                    break;
            }

        } while (menu != 0);

    }

}

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

        Pangkat[] png = new Pangkat[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan: ");
            int angka = sc.nextInt();
            System.out.print("Masukkan nilai pangkat: ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(angka, pangkat);
        }
        System.out.println("==================================");

        System.out.println("Hasil Pangkat - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat));

        }
        System.out.println("----------------------------------");
        System.out.println("Hasil Pangkat - DIVINE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));

        }
        System.out.println("==================================");

    }

}

package Algoritma.Pertemuan05.BruteForceDivideConquer.Percobaan03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner dob = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("Program Menghitung Keuntungan Total(satuan juta, misal 1.1)");
        System.out.print("Masukkan Jumlah Bulan : ");
        int elemen = sc.nextInt();
        Sum sm = new Sum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan Keuntungan Bulan ke-" + (i + 1) + " : ");
            sm.keuntungan[i] = dob.nextDouble();
        }

        System.out.println("=================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println(
                "Total Keuntungan Perusahaan Selama " + sm.elemen + " Bulan adalah "
                        + sm.totalBF(sm.keuntungan));

        System.out.println("=================================================");
        System.out.println("Algoritma Divide and Conquer");

        System.out.println(
                "Total Keuntungan Perusahaan Selama " + sm.elemen + " Bulan adalah "
                        + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));

        sc.close();
    }
}

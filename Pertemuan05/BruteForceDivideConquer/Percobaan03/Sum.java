package Algoritma.Pertemuan05.BruteForceDivideConquer.Percobaan03;

import java.util.Scanner;

public class Sum {
    int elemen;
    double keuntungan[], total;

    Sum(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]) {
        for (int i = 0; i < elemen; i++) {
            total += arr[i];

        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid - 1);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum + arr[mid];
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner dob = new Scanner(System.in);

        System.out.println("========================================================");
        System.out.println("|         PROGRAM HITUNG KEUNTUNGAN PERUSAHAAN         |");
        System.out.println("--------------------------------------------------------");
        System.out.print("Masukkan Banyak Perusahaan : ");
        int perusahaan = sc.nextInt();
        Sum sm[] = new Sum[perusahaan];

        for (int i = 0; i < perusahaan; i++) {
            System.out.println("--------------------------------------------------------");
            System.out.print("Masukkan Jumlah Bulan Perusahaan " + (i + 1) + " : ");
            int elemen = sc.nextInt();
            sm[i] = new Sum(elemen);
            System.out.println("--------------------------------------------------------");
            System.out.println("Satuan juta, misal 1,1 -> gunakan koma(,)");
            for (int j = 0; j < sm[i].elemen; j++) {
                System.out.print("Masukkan Keuntungan Bulan ke-" + (j + 1) + " : ");
                sm[i].keuntungan[j] = dob.nextDouble();
            }
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("Algoritma Brute Force");
        for (int i = 0; i < sm.length; i++) {
            System.out.println(
                    "Total Keuntungan Perusahaan " + (i + 1) + " Selama " + sm[i].elemen + " Bulan adalah "
                            + sm[i].totalBF(sm[i].keuntungan));
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("Algoritma Divide and Conquer");
        for (int i = 0; i < sm.length; i++) {
            System.out.println(
                    "Total Keuntungan Perusahaan " + (i + 1) + " Selama " + sm[i].elemen + " Bulan adalah "
                            + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen - 1));

        }
        System.out.println("========================================================");

    }

}

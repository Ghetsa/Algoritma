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

        System.out.println("=================================================");
        System.out.println("Program Menghitung Keuntungan Total(satuan juta, misal 1,1 -> gunakan koma(,))");
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


package Algoritma.Pertemuan05.BruteForceDivideConquer.Percobaan01;

import java.util.Scanner;

public class Faktorial {
    int iNilai;

    int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }

    int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------");
        System.out.print("Masukkan jumlah elemen : ");
        int iJml = sc.nextInt();

        Faktorial[] fk = new Faktorial[iJml];

        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " : ");
            fk[i].iNilai = sc.nextInt();
        }

        System.out.println("Hasil Brute Force");
        for (int i = 0; i < iJml; i++) {
            System.out.print("Hasil penghitungan faktorial " + (i + 1) + " menggunakan metode Brute Force adalah "
                    + fk[i].faktorialBF(fk[i].iNilai));
            System.out.println();
        }

        System.out.println("Hasil Divide and Conquer");
        for (int i = 0; i < iJml; i++) {
            System.out.print("Hasil penghitungan faktorial " + (i + 1)
                    + " menggunakan metode Divide and Conquer adalah " + fk[i].faktorialDC(fk[i].iNilai));
            System.out.println();
        }

        sc.close();
    }
}

package Algoritma.Pertemuan03;

import java.util.Scanner;

public class ArrayObjects {

    public static class PersegiPanjang {
        public int panjang;
        public int lebar;
    }

    public static void main(String[] args) {
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("panjang; " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);

        }
    }

}

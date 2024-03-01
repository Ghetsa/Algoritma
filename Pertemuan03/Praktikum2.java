package Algoritma.Pertemuan03;

import java.util.Scanner;

public class Praktikum2 {

    public static class Mahasiswa {
        public String nama;
        public int nim;
        public char jk;
        public double ip;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] mhs = new Mahasiswa[3];
        for (int i = 0; i < 3; i++) {
            mhs[i] = new Mahasiswa();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan Nama: ");
            mhs[i].nama = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            mhs[i].nim = sc.nextInt();
            System.out.print("Masukkan Jenis Kelamin: ");
            mhs[i].jk = sc.next().charAt(0);
            System.out.print("Masukkan IP: ");
            mhs[i].ip = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("====================================================");
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < 3; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + mhs[i].nama);
            System.out.println("NIM: " + mhs[i].nim);
            System.out.println("Jenis Kelamin: " + mhs[i].jk);
            System.out.println("----------------------------------------------------");
        }

    }
}

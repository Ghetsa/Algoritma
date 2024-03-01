package Algoritma.Pertemuan03;

import java.util.Scanner;

public class DataMhs {

    public static class Mahasiswa {
        public String nama;
        public int nim;
        public char jk;
        public double ip;

        public Mahasiswa(String nama, int nim, char jk, double ip) {
            this.nama = nama;
            this.nim = nim;
            this.jk = jk;
            this.ip = ip;
        }
    }

    public static void inputDataMahasiswa(Mahasiswa[] mhs, Scanner sc) {
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan Nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            int nim = sc.nextInt();
            System.out.print("Masukkan Jenis Kelamin: ");
            char jk = sc.next().charAt(0);
            System.out.print("Masukkan IP: ");
            double ip = sc.nextDouble();
            sc.nextLine();
            mhs[i] = new Mahasiswa(nama, nim, jk, ip);
        }
    }

    public static double hitungRataRataIPK(Mahasiswa[] mhs) {
        double totalIPK = 0;
        for (Mahasiswa mahasiswa : mhs) {
            totalIPK += mahasiswa.ip;
        }
        return totalIPK / mhs.length;
    }

    public static Mahasiswa cariIPKTerbesar(Mahasiswa[] mhs) {
        Mahasiswa maxIPMahasiswa = mhs[0];
        for (int i = 1; i < mhs.length; i++) {
            if (mhs[i].ip > maxIPMahasiswa.ip) {
                maxIPMahasiswa = mhs[i];
            }
        }
        return maxIPMahasiswa;
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = a.nextInt();
        Mahasiswa[] mhs = new Mahasiswa[jmlMhs];
        inputDataMahasiswa(mhs, sc);

        System.out.println("====================================================");
        System.out.println("----------------------------------------------------");

        System.out.println("Data Mahasiswa:");
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + mhs[i].nama);
            System.out.println("NIM: " + mhs[i].nim);
            System.out.println("Jenis Kelamin: " + mhs[i].jk);
            System.out.println("IPK: " + mhs[i].ip);
            System.out.println("----------------------------------------------------");
        }

        double rataRataIPK = hitungRataRataIPK(mhs);
        System.out.println("Rata-rata IPK: " + rataRataIPK);

        Mahasiswa maxIPMahasiswa = cariIPKTerbesar(mhs);
        System.out.println("Mahasiswa dengan IPK terbesar:");
        System.out.println("Nama: " + maxIPMahasiswa.nama);
        System.out.println("NIM: " + maxIPMahasiswa.nim);
        System.out.println("Jenis Kelamin: " + maxIPMahasiswa.jk);
        System.out.println("IPK: " + maxIPMahasiswa.ip);
    }
}

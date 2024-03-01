package Algoritma.Pertemuan03;

import java.util.Scanner;

import Algoritma.Pertemuan03.Praktikum1_Bola.Bola;
import Algoritma.Pertemuan03.Praktikum1_LimasPersegi.Limas;
import Algoritma.Pertemuan03.Praktikum1_kerucut.Kerucut;

public class BangunRuangMain12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================================");

        System.out.print("Masukan banyak kerucut: ");
        int a = sc.nextInt();
        Kerucut[] kerucuts = new Kerucut[a];
        for (int i = 0; i < a; i++) {
            kerucuts[i] = new Kerucut();
        }

        for (int i = 0; i < a; i++) {
            System.out.println("Kerucut ke-" + (i + 1));
            System.out.print("Masukkan jari-jari: ");
            kerucuts[i].jari = sc.nextInt();
            System.out.print("Masukkan sisi miring: ");
            kerucuts[i].selimut = sc.nextInt();
            kerucuts[i].hitungTinggi();
            System.out.println("----------------------------------------------------");

        }

        for (int i = 0; i < a; i++) {
            System.out.println("Kerucut ke-" + (i + 1));
            System.out.println(
                    "Jari-jari: " + kerucuts[i].jari + ", tinggi: " + kerucuts[i].tinggi + ", selimut: "
                            + kerucuts[i].selimut);
            System.out.println("Volume: " + kerucuts[i].hitungVolume());
            System.out.println("Luas Permukaan: " + kerucuts[i].hitungLPermukaan());
            System.out.println("----------------------------------------------------");
        }
        System.out.println("====================================================");

        System.out.print("Masukan banyak Limas Persegi: ");
        int b = sc.nextInt();
        Limas[] limass = new Limas[b];
        for (int i = 0; i < b; i++) {
            limass[i] = new Limas();
        }

        for (int i = 0; i < b; i++) {
            System.out.println("Limas ke-" + (i + 1));
            System.out.print("Masukkan Alas: ");
            limass[i].sisi = sc.nextInt();
            System.out.print("Masukkan Tinggi: ");
            limass[i].tinggi = sc.nextInt();
            limass[i].hitungSMiring();
            System.out.println("----------------------------------------------------");

        }

        for (int i = 0; i < b; i++) {
            System.out.println("Limas ke-" + (i + 1));
            System.out.println("Alas: " + limass[i].sisi + ", tinggi: " + limass[i].tinggi + ", sisi miring: "
                    + limass[i].sisiMiring);
            System.out.println("Volume: " + limass[i].hitungVolume());
            System.out.println("Luas Permukaan: " + limass[i].hitungLPermukaan());
            System.out.println("----------------------------------------------------");
        }
        System.out.println("====================================================");

        System.out.print("Masukan banyak Bola: ");
        int c = sc.nextInt();
        Bola[] bolas = new Bola[c];
        for (int i = 0; i < c; i++) {
            bolas[i] = new Bola();
        }

        for (int i = 0; i < c; i++) {
            System.out.println("Bola ke-" + (i + 1));
            System.out.print("Masukkan jari-jari: ");
            bolas[i].jari = sc.nextInt();
        }

        System.out.println("----------------------------------------------------");

        for (int i = 0; i < c; i++) {
            System.out.println("Bola ke-" + (i + 1));
            System.out.println("Jari-jari: " + bolas[i].jari);
            System.out.println("Volume: " + bolas[i].hitungVolume());
            System.out.println("Luas Permukaan: " + bolas[i].hitungLPermukaan());
            System.out.println("----------------------------------------------------");
        }
        System.out.println("====================================================");

    }

}

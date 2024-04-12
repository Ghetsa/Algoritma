package Algoritma.Pertemuan07.Praktikum.Latihan01;

public class Buku12 {
    int tahunTerbit, stock;
    String kodeBuku, judulBuku, pengarang;

    public Buku12(String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    public void tampilDataBuku() {
        System.out.printf("|%-15s| %-27s|%n", "Kode Buku", kodeBuku);
        System.out.printf("|%-15s| %-27s|%n", "Judul Buku", judulBuku);
        System.out.printf("|%-15s| %-27s|%n", "Tahun Terbit", tahunTerbit);
        System.out.printf("|%-15s| %-27s|%n", "Pengarang", pengarang);
        System.out.printf("|%-15s| %-27s|%n", "Stok", stock);

    }
}

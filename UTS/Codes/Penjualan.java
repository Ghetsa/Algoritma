package Algoritma.UTS.Codes;

public class Penjualan {
    int tgl, penjualan;
    

    Penjualan(int t, int p) {
        tgl = t;
        penjualan = p;
    }

    void tampil() {
        System.out.printf("|%-15s| %-27s|%n", "Tanggal", tgl);
            System.out.printf("|%-15s| %-27s|%n", "Penjualan", penjualan);
    }
}

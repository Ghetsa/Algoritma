package Algoritma.Pertemuan02;

public class Buku12 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: " + harga);
    }

    void terjual(int jml) {
        if (jml > 0) {
            stok -= jml;
        }
    }

    void restok(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public Buku12() {

    }

    public Buku12(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    int hitungHargaTotal(int hrg, int jm) {
        int tot = hrg * jm;
        return tot;
    }

    int hitungDiskon(int ttl) {
        int total = ttl;
        int dis;
        if (total > 150000) {
            dis = 12 / 100;
        } else if (total >= 75000 && total <= 150000) {
            dis = 5 / 100;
        } else {
            dis = 0;
        }

        return dis;
    }

    int hitungHargaBayar(int tot, int dis) {
        int hargaDis = tot * dis;
        int hargaBayar = tot - hargaDis;

        return hargaBayar;
    }

    Buku12 bukuMahasiswa = new Buku12("JudulBuku", "PengarangBuku", 200, 10, 50000);

}

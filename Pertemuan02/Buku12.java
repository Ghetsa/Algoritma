package Algoritma.Pertemuan02;

public class Buku12 {
    String judul, pengarang;
    int halaman, stok, harga, total, dis, bayar;

    void tampilInformasi() {
        System.out.println("=========================================");
        System.out.println("Judul         : " + judul);
        System.out.println("Pengarang     : " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa stok     : " + stok);
        System.out.println("Harga         : Rp " + harga);
        System.out.println("Harga Total   : " + total);
        System.out.println("Diskon        : " + dis);
        System.out.println("Harga Bayar   : " + bayar);
        System.out.println("=========================================");
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

    void hitungHargaTotal(int jml) {
        total = harga * stok;
    }

    void hitungDiskon() {
        if (total > 150000) {
            dis += total * 0.12;
        } else if (total > 75000 && total <= 150000) {
            dis += total * 0.5;
        } else {
            System.out.println("Tidak ada diskon");
        }
    }

    void hitungHargaBayar() {
        bayar = total - dis;
    }

    // Buku12 bukuMahasiswa = new Buku12("JudulBuku", "PengarangBuku", 200, 10,
    // 50000);

}

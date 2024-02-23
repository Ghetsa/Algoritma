package Algoritma.Pertemuan02;

public class BukuMain12 {
    public static void main(String[] args) {
        Buku12 bk1 = new Buku12();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.hitungHargaTotal(5);
        bk1.hitungDiskon();
        bk1.hitungHargaBayar();
        bk1.tampilInformasi();

        Buku12 bk2 = new Buku12("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.hitungHargaTotal(11);
        bk2.hitungDiskon();
        bk2.hitungHargaBayar();
        bk2.tampilInformasi();

        // Buku08 bukuDiana = new Buku08("Hujan","Tere Liye", 150, 20, 60000);
        // bukuDiana.tampilInformasi();

    }
}

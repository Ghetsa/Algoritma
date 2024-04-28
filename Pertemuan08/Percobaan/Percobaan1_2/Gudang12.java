package Algoritma.Pertemuan08.Percobaan.Percobaan1_2;

public class Gudang12 {
    Barang12 listBarang[] = new Barang12[7];
    Barang12[] tumpukan;
    int size;
    int top;

    public Gudang12(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang12[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang12 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah Penuh!!");
        }
        System.out.println("----------------------------------------------");

    }

    public void ambilBarang() {
        if (!cekKosong()) {
            Barang12 delete = tumpukan[top];
            top--;
            System.out.println("----------------------------------------------");
            System.out.printf("|%-43s %s|%n", " Barang [" + delete.nama + "] berhasil diambil ke Gudang", "");
            System.out.printf("|%-27s| %-15s|%n", " Kode unik dalam biner", konversiDesimalKeBiner(delete.kode));
            System.out.println("----------------------------------------------");

        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang Kosong!!");
        }
    }

    public Barang12 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang12 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang");
            for (int i = 0; i <= top; i++) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan Barang Kosong");
        }
    }

    // percobaan 2
    public String konversiDesimalKeBiner(int kode) {
        StackKonversi stack = new StackKonversi();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;

        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;

    }
}

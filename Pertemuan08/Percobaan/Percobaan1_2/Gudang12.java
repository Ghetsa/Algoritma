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
        System.out.println("----------------------------------------------");
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.printf("|%-43s %s|%n", " [" + brg.nama + "] berhasil ditambah ke Gudang", "");
        } else {
            System.out.printf("|%-43s %s|%n", " Gagal! Tumpukan barang sudah penuh!!", "");
        }
        System.out.println("----------------------------------------------");

    }

    public void ambilBarang() {
        if (!cekKosong()) {
            Barang12 delete = tumpukan[top];
            top--;
            System.out.println("==============================================");
            System.out.printf("|%-43s %s|%n", " [" + delete.nama + "] berhasil diambil ke Gudang", "");
            // System.out.println("----------------------------------------------");
            // System.out.printf("|%-27s| %-15s|%n", " Kode unik dalam biner",
                    // konversiDesimalKeBiner(delete.kode));
            System.out.println("==============================================");

        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang Kosong!!");
        }
    }

    public Barang12 lihatBarangTeratas() {
        System.out.println("==============================================");
        System.out.println("|                BARANG TERATAS              |");
        System.out.println("----------------------------------------------");
        if (!cekKosong()) {
            Barang12 barangTeratas = tumpukan[top];
            System.out.printf("|%-43s %s|%n", " Kode       | " + barangTeratas.kode, "");
            System.out.printf("|%-43s %s|%n", " Nama       | " + barangTeratas.nama, "");
            System.out.printf("|%-43s %s|%n", " Kategori   | " + barangTeratas.kategori, "");
            System.out.println("==============================================");
            return barangTeratas;
        } else {
            System.out.println("         !!! TUMPUKAN BARANG KOSONG !!!       ");
            System.out.println("==============================================");
            return null;
        }

    }

    public void tampilkanBarang() {
        System.out.println("==============================================");
        System.out.println("|            RINCIAN TUMPUKAN BARANG         |");
        System.out.println("----------------------------------------------");
        if (!cekKosong()) {
            for (int i = top; i >= 0; i--) {
                System.out.printf("| Kode %-3d| Nama %-9s| Kategori %-8s|\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("         !!! TUMPUKAN BARANG KOSONG !!!       ");
        }
        System.out.println("==============================================");
    }

    // percobaan 2
    public String konversiDesimalKeBiner(int kode) {
        StackKonversi stack = new StackKonversi();
        while (kode != 0) {
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

    // Praktikum
    public Barang12 lihatBarangTerbawah() {
        System.out.println("==============================================");
        System.out.println("|                BARANG TERBAWAH              |");
        System.out.println("----------------------------------------------");
        if (!cekKosong()) {
            Barang12 barangTerbawah = tumpukan[0];
            System.out.printf("|%-43s %s|%n", " Kode       | " + barangTerbawah.kode, "");
            System.out.printf("|%-43s %s|%n", " Nama       | " + barangTerbawah.nama, "");
            System.out.printf("|%-43s %s|%n", " Kategori   | " + barangTerbawah.kategori, "");
            System.out.println("==============================================");
            return barangTerbawah;
        } else {
            System.out.println("         !!! TUMPUKAN BARANG KOSONG !!!       ");
            System.out.println("==============================================");
            return null;
        }

    }

    public void FindSeqKode(int cari) {
        int posisi = -1;
        for (int i = 0; i < tumpukan.length; i++) {
            if (tumpukan[i] != null && tumpukan[i].kode == cari) {
                posisi = i;
                break;
            }
        }
        Tampil(posisi);
    }

    public void FindSeqNama(String cari) {
        int posisi = -1;
        for (int i = 0; i < tumpukan.length; i++) {
            if (tumpukan[i] != null && tumpukan[i].nama.equalsIgnoreCase(cari)) {
                posisi = i;
                break;
            }
        }
        Tampil(posisi);
    }

    public void Tampil(int posisi){
        System.out.println("==============================================");
        System.out.println("|               PENCARIAN BARANG             |");
        System.out.println("----------------------------------------------");
        if (posisi != -1) {
            // Barang12 cariBarang = tumpukan[posisi];
            System.out.printf("|%-43s %s|%n", " Kode       | " + tumpukan[posisi].kode, "");
            System.out.printf("|%-43s %s|%n", " Nama       | " + tumpukan[posisi].nama, "");
            System.out.printf("|%-43s %s|%n", " Kategori   | " + tumpukan[posisi].kategori, "");
            System.out.println("==============================================");
        } else {
            System.out.println("         !!! BARANG TIDAK DITEMUKAN !!!       ");
            System.out.println("==============================================");
            
        }
    }
    
    void insertionSortKode() {
        for (int i = 1; i < tumpukan.length; i++) {
            Barang12 temp = tumpukan[i];
            int j = i;
            while (j > 0 && tumpukan[j - 1].kode - temp.kode > 0) {
                tumpukan[j] = tumpukan[j - 1];
                j--;
            }
            tumpukan[j] = temp;
        }
    }
    
    public int FindBinarySearchKode(int cari, int left, int right) {
        insertionSortKode();
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == tumpukan[mid].kode) {
                return mid;
            } else if (tumpukan[mid].kode - cari > 0) {
                return FindBinarySearchKode(cari, left, mid - 1);
            } else {
                return FindBinarySearchKode(cari, mid + 1, right);
            }
        }
        return -1;
    }
    void insertionSortNama() {
        for (int i = 1; i < tumpukan.length; i++) {
            Barang12 temp = tumpukan[i];
            int j = i;
            while (j > 0 && tumpukan[j - 1].kode - temp.kode > 0) {
                tumpukan[j] = tumpukan[j - 1];
                j--;
            }
            tumpukan[j] = temp;
        }
    }
    
    public int FindBinarySearchNama(String cari, int left, int right) {
        insertionSortNama();
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari.equalsIgnoreCase(tumpukan[mid].nama)) {
                return mid;
            } else if (tumpukan[mid].nama.compareTo(cari) < 0) {
                return FindBinarySearchNama(cari, left, mid - 1);
            } else {
                return FindBinarySearchNama(cari, mid + 1, right);
            }
        }
        return -1;
    }
}

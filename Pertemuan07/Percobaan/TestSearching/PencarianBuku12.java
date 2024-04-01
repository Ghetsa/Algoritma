package Algoritma.Pertemuan07.Percobaan.TestSearching;

public class PencarianBuku12 {
    Buku12 listBk[] = new Buku12[5];
    int idx;

    void tambah(Buku12 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("!!! Data Sudah Penuh !!!");
        }
    }

    void tampil() {
        for (Buku12 m : listBk) {
            System.out.println("----------------------------------------------");
            m.tampilDataBuku();
        }
    }

    public void TampilData(int x, int pos) {
        System.out.println("----------------------------------------------");
        if (pos != -1) {
            System.out.printf("|%-15s| %-27s|%n", "Kode Buku", x);
            System.out.printf("|%-15s| %-27s|%n", "Judul Buku", listBk[pos].judulBuku);
            System.out.printf("|%-15s| %-27s|%n", "Judul Buku", listBk[pos].tahunTerbit);
            System.out.printf("|%-15s| %-27s|%n", "Judul Buku", listBk[pos].pengarang);
            System.out.printf("|%-15s| %-27s|%n", "Judul Buku", listBk[pos].stock);
        } else {
            System.out.println("!!!          Data Tidak Ditemukan          !!!");
        }
        System.out.println("----------------------------------------------");

    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i] != null && listBk[i].kodeBuku == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listBk[mid].kodeBuku) {
                return mid;
            } else if (listBk[mid].kodeBuku > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);

            }
        }
        return -1;
    }

    public void TampilPosisi(int x, int pos) {
        System.out.println("----------------------------------------------");
        if (pos != -1) {
            System.out.printf("|%-15s| %-27s|%n", "Data : " + x, "Ditemukan pada Indeks " + pos);
        } else {
            System.out.printf("|%-15s| %-27s|%n", "Data : " + x, "!!! Tidak Ditemukan !!!");
        }
        System.out.println("----------------------------------------------");

    }

}

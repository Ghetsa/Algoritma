package Algoritma.Pertemuan07.Praktikum.Latihan01;

public class PencarianBuku12 {
    Buku12 listBk[] = new Buku12[3];
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

    public void TampilData(String x, int pos) {
        System.out.println("----------------------------------------------");
        if (pos != -1) {
            System.out.printf("|%-15s| %-27s|%n", "Kode Buku", listBk[pos].kodeBuku);
            System.out.printf("|%-15s| %-27s|%n", "Judul Buku", listBk[pos].judulBuku);
            System.out.printf("|%-15s| %-27s|%n", "Tahun Terbit", listBk[pos].tahunTerbit);
            System.out.printf("|%-15s| %-27s|%n", "Pengarang", listBk[pos].pengarang);
            System.out.printf("|%-15s| %-27s|%n", "Stok", listBk[pos].stock);
        } else {
            System.out.println("!!!          Data Tidak Ditemukan          !!!");
        }

    }

    // public int FindSeqSearch(int cari) {
    // int posisi = -1;
    // for (int i = 0; i < listBk.length; i++) {
    // if (listBk[i] != null && listBk[i].kodeBuku == cari) {
    // posisi = i;
    // break;
    // }
    // }
    // return posisi;
    // }

    // public int FindBinarySearch(int cari, int left, int right) {
    // int mid;
    // if (right >= left) {
    // mid = (left + right) / 2;
    // if (cari == listBk[mid].kodeBuku) {
    // return mid;
    // } else if (listBk[mid].kodeBuku > cari) {
    // return FindBinarySearch(cari, left, mid - 1);
    // } else {
    // return FindBinarySearch(cari, mid + 1, right);

    // }
    // }
    // return -1;
    // }

    public int FindSeqSearch(String cari) {
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i] != null && listBk[i].kodeBuku.equalsIgnoreCase(cari)) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public Buku12 FindBuku(String cari) {
        for (Buku12 buku : listBk) {
            if (buku != null && buku.judulBuku.equals(cari)) {
                return buku;
            }
        }
        return null;
    }

    public int FindSeqJudul(String cari) {
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i] != null && listBk[i].judulBuku.equalsIgnoreCase(cari)) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari.equalsIgnoreCase(listBk[mid].kodeBuku)) {
                return mid;
            } else if (listBk[mid].kodeBuku.compareTo(cari) > 0) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void TampilPosisi(String x, int pos) {
        System.out.println("----------------------------------------------");
        if (pos != -1) {
            System.out.printf("|%-15s| %-27s|%n", " Data : " + x, "Ditemukan pada Indeks " + pos);
        } else {
            System.out.printf("|%-15s| %-27s|%n", "Data : " + x, "!!! Tidak Ditemukan !!!");
        }
        System.out.println("----------------------------------------------");

    }

}

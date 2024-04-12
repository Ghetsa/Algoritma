package Algoritma.Pertemuan07.Praktikum.Latihan02;

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

    public void TampilPosisi(int pos) {
        if (pos != -1) {
            System.out.println("----------------------------------------------");
            System.out.printf("|%-15s| %-27s|%n", " Data : " + listBk[pos].kodeBuku, "Ditemukan pada Indeks " + pos);
            System.out.println("----------------------------------------------");
        }

    }

    public void TampilData(int pos) {
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

    public void bubbleSort() {
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = 1; j < listBk.length - i; j++) {
                if (listBk[j] != null && listBk[j - 1] != null) {
                    if (listBk[j].kodeBuku < listBk[j - 1].kodeBuku) {
                        Buku12 temp = listBk[j];
                        listBk[j] = listBk[j - 1];
                        listBk[j - 1] = temp;
                    }
                }
            }
        }
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

    public int FindBinaryJudul(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari.equalsIgnoreCase(listBk[mid].judulBuku)) {
                return mid;
            } else if (listBk[mid].judulBuku.compareTo(cari) < 0) {
                return FindBinaryJudul(cari, left, mid - 1);
            } else {
                return FindBinaryJudul(cari, mid + 1, right);
            }
        }
        return -1;
    }

}

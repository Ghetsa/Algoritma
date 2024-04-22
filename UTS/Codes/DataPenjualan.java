package Algoritma.UTS.Codes;

public class DataPenjualan {
    Penjualan listJual[] = new Penjualan[17];
    int index;

    DataPenjualan() {
        listJual[0] = new Penjualan(1, 29);
        listJual[1] = new Penjualan(2, 35);
        listJual[2] = new Penjualan(3, 43);
        listJual[3] = new Penjualan(4, 21);
        listJual[4] = new Penjualan(5, 27);
        listJual[5] = new Penjualan(6, 32);
        listJual[6] = new Penjualan(7, 6);
        listJual[7] = new Penjualan(8, 13);
        listJual[8] = new Penjualan(9, 1);
        listJual[9] = new Penjualan(10, 27);
        listJual[10] = new Penjualan(11, 29);
        listJual[11] = new Penjualan(12, 31);
        listJual[12] = new Penjualan(13, 1);
        listJual[13] = new Penjualan(14, 20);
        listJual[14] = new Penjualan(15, 19);
        listJual[15] = new Penjualan(16, 29);
        listJual[16] = new Penjualan(17, 12);
    }

    void tampil() {
        System.out.println("==============================================");
        for (Penjualan m : listJual) {
            m.tampil();
            System.out.println("----------------------------------------------");
        }
    }

    public void TampilData(int pos) {
        System.out.println("----------------------------------------------");
        if (pos != -1) {
            System.out.printf("|%-15s| %-27s|%n", "Tanggal", listJual[pos].tgl);
            System.out.printf("|%-15s| %-27s|%n", "Penjualan", listJual[pos].penjualan);

        } else {
            System.out.println("!!!          Data Tidak Ditemukan          !!!");
        }

    }

    public void TampilPosisi(int x, int pos) {
        System.out.println("----------------------------------------------");
        if (pos != -1) {
            System.out.printf("|%-15s| %-27s|%n", " Data : " + x, "Ditemukan pada Indeks " + pos);
        } else {
            System.out.printf("|%-15s| %-27s|%n", "Data : " + x, "!!! Tidak Ditemukan !!!");
        }
        System.out.println("----------------------------------------------");

    }

    void insertionSort() {
        for (int i = 1; i < listJual.length; i++) {
            Penjualan temp = listJual[i];
            int j = i;
            while (j > 0 && listJual[j - 1].penjualan > temp.penjualan) {
                listJual[j] = listJual[j - 1];
                j--;
            }
            listJual[j] = temp;
        }
    }

    public int FindBinarySearch(int cari, int left, int right) {
        insertionSort();
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listJual[mid].penjualan) {
                return mid;
            } else if (listJual[mid].penjualan > cari) {
                return FindBinarySearch(cari, left, mid);
            } else {
                return FindBinarySearch(cari, mid + 1, right);

            }
        }
        return -1;
    }

}

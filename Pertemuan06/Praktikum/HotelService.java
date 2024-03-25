package Algoritma.Pertemuan06.Praktikum;

public class HotelService {
    Hotel rooms[] = new Hotel[5];
    int index;

    void tambah(Hotel h) {
        if (index < rooms.length) {
            rooms[index] = h;
            index++;
        } else {
            System.out.println("Data sudah penuh!!!!");
        }
    }

    void tampilAll() {

        for (Hotel h : rooms) {
            if (h != null) {
                System.out.printf("|%-12s| %-30s|%n", "Nama", h.nama);
                System.out.printf("|%-12s| %-30s|%n", "Kota", h.kota);
                System.out.printf("|%-12s| %-30s|%n", "Harga", h.harga);
                System.out.printf("|%-12s| %-30s|%n", "Bintang", h.bintang);
                System.out.println("----------------------------------------------");
            }

        }
    }

    void bubbleSort(String dasar) {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if (rooms[j] != null && rooms[j - 1] != null) {
                    if (dasar.equals("harga")) {
                        if (rooms[j].harga < rooms[j - 1].harga) {
                            Hotel temp = rooms[j];
                            rooms[j] = rooms[j - 1];
                            rooms[j - 1] = temp;
                        }
                    } else if (dasar.equals("bintang")) {
                        if (rooms[j].bintang > rooms[j - 1].bintang) {
                            Hotel temp = rooms[j];
                            rooms[j] = rooms[j - 1];
                            rooms[j - 1] = temp;
                        }
                    }
                }
            }
        }
    }

    // void selectionSortHarga() {
    // for (int i = 0; i < rooms.length; i++) {
    // int iMin = i;
    // for (int j = i + 1; j < rooms.length; j++) {
    // if (rooms[j] != null ) {
    // if (rooms[j].harga < rooms[iMin].harga) {
    // iMin = j;
    // }
    // }
    // }
    // Hotel temp = rooms[i];
    // rooms[i] = rooms[iMin];
    // rooms[iMin] = temp;
    // }
    // }

    void selectionSort(String dasar) {
        if (dasar.equals("harga")) {
            for (int i = 0; i < rooms.length; i++) {
                int iMin = i;
                for (int j = i + 1; j < rooms.length; j++) {
                    if (rooms[j] != null) {
                        if (rooms[j].harga < rooms[iMin].harga) {
                            iMin = j;
                        }
                    }
                }
                Hotel temp = rooms[i];
                rooms[i] = rooms[iMin];
                rooms[iMin] = temp;
            }
        } else if (dasar.equals("bintang")) {
            for (int i = 0; i < rooms.length; i++) {
                int iMax = i;
                for (int j = i + 1; j < rooms.length; j++) {
                    if (rooms[j] != null) {
                        if (rooms[j].bintang > rooms[iMax].bintang) {
                            iMax = j;
                        }
                    }
                }
                Hotel temp = rooms[i];
                rooms[i] = rooms[iMax];
                rooms[iMax] = temp;
            }
        }

    }

}

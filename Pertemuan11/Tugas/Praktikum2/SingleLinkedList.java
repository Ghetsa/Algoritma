package Algoritma.Pertemuan11.Tugas.Praktikum2;

public class SingleLinkedList {
    Node head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    void print() {
        System.out.println("==============================================");
        System.out.println("|           LIST ANTRIAN MAHASISWA           |");
        System.out.println("----------------------------------------------");

        if (!isEmpty()) {
            int i = 0;
            Node tmp = head;
            System.out.printf("| %-8s| %-8s| %-10s| %-10s %s|%n", "ANTRIAN", "INDEX", "NIM", "NAMA", "");
            System.out.println("----------------------------------------------");

            while (tmp != null) {
                System.out.printf("| %-8s| %-8s| %-10s| %-10s %s|%n", (i + 1), i, tmp.data.nim, tmp.data.nama, "");
                // System.out.println("| Mhs" + (i + 1) + ", NIM: " + tmp.data.nim + ", Nama: "
                // + tmp.data.nama);
                tmp = tmp.next;
                i++;
            }

        } else {
            System.out.println("|          !! LIST ANTRIAN KOSONG !!         |");
        }
        System.out.println("==============================================");

        System.out.println("");
    }

    void addFirst(Mahasiswa mhs) {
        Node ndInput = new Node(mhs, null);
        if (isEmpty()) {// jika kosong, head & tail == node baru
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
        System.out.println("----------------------------------------------");
        System.out.println("|          DATA BERHASIL DITAMBAHKAN         |");
        System.out.println("----------------------------------------------");

    }

    void addLast(Mahasiswa mhs) {
        Node ndInput = new Node(mhs, null);
        if (isEmpty()) { // jika kosong, head & tail == node baru
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput; // node baru ditaruh setelah tail yg sudah ada
            tail = ndInput; // ubah tail menjadi node baru
        }

        System.out.println("----------------------------------------------");
        System.out.println("|          DATA BERHASIL DITAMBAHKAN         |");
        System.out.println("----------------------------------------------");
    }

    void insertAfter(int key, Mahasiswa mhs) {
        Node ndInput = new Node(mhs, null);
        Node temp = head; // note temporary
        boolean insert = false;
        do {
            if (temp.data.nim == key) {
                ndInput.next = temp.next; // node setelah key jadi next node baru
                temp.next = ndInput; // node baru jadi next nya key

                // if (ndInput.next != null) {
                if (ndInput.next == null) {
                    tail = ndInput; // jika key merupakan tail, ubah input jadi tail
                    break;
                }
                insert = true;
            }
            temp = temp.next;
            
        } while (temp != null);// } while (temp == null); (menjalankan perulangan selama tmp tidak kosong)

        // handle key success/failed
        if (insert == false) {
            System.out.println("----------------------------------------------");
            System.out.println("|      !! GAGAL! KEY TIDAK DITEMUKAN !!      |");
            System.out.println("----------------------------------------------");
        } else {
            System.out.println("----------------------------------------------");
            System.out.println("|          DATA BERHASIL DITAMBAHKAN         |");
            System.out.println("----------------------------------------------");

        }

    }

    int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void insertAt(int index, Mahasiswa mhs) {
        if (index < 0 || index > (size() + 1)) { // Memeriksa apakah indeks valid
            System.out.println("----------------------------------------------");
            System.out.println("|       !! GAGAL! INDEX TIDAK VALID !!       |");
            System.out.println("----------------------------------------------");
            return; // Menghentikan eksekusi jika indeks tidak valid
        }

        if (index == 0) {
            addFirst(mhs); // Panggil fungsi addFirst jika indeks adalah 0
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next; // Memindahkan temp ke node sebelum node yang dituju
            }

            temp.next = new Node(mhs, temp.next); // Memasukkan node baru antara temp dan temp.next

            if (temp.next.next == null) {
                tail = temp.next; // Jika index adalah tail, ubah tail menjadi temp.next
            }
        }

        System.out.println("----------------------------------------------");
        System.out.println("|          DATA BERHASIL DITAMBAHKAN         |");
        System.out.println("----------------------------------------------");
    }

    Mahasiswa getData(int index) {
        if (isEmpty()) {
            System.out.println("----------------------------------------------");
            System.out.println("|          !! LIST ANTRIAN KOSONG !!         |");
            System.out.println("----------------------------------------------");
            return null; // null jika list kosong
        }

        Node tmp = head;
        for (int i = 0; i < index; i++) { // for (int i = 0; i < index+1; i++) {
            if (tmp == null) {
                System.out.println("----------------------------------------------");
                System.out.println("|       !! INDEX DILUAR PANJANG LIST!!       |");
                System.out.println("----------------------------------------------");
                System.out.println("|         !!!DATA TIDAK DITEMUKAN!!!         |");
                System.out.println("----------------------------------------------");
                return null; // null jika list kosong
            }
            tmp = tmp.next; // cari data berdasarkan index

        }
        return tmp.data; // return tmp.next.data;
    }

    int indexOf(int key) {
        Node tmp = head;
        int index = 0;
        while (tmp != null) { // cari data berdasarkan key
            if (tmp.data.nim == key) { // data ditemukan
                return index;
            }
            tmp = tmp.next;
            index++;

        }
        // Jika data tidak ditemukan
        return -1; // return 1;

    }

    void removeFirst() {
        if (isEmpty()) { // if (!isEmpty()) {
            System.out.println("----------------------------------------------");
            System.out.println("|          !! LIST ANTRIAN KOSONG !!         |");
            System.out.println("----------------------------------------------");
        } else if (head == tail) { // if hanya 1 data, null keun
            head = tail = null;
            System.out.println("----------------------------------------------");
            System.out.println("|            DATA BERHASIL DIHAPUS           |");
            System.out.println("----------------------------------------------");
        } else { // skip it to the next
            head = head.next;
            System.out.println("----------------------------------------------");
            System.out.println("|            DATA BERHASIL DIHAPUS           |");
            System.out.println("----------------------------------------------");
        }
    }

    void removeLast() {
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
                System.out.println("----------------------------------------------");
                System.out.println("|            DATA BERHASIL DIHAPUS           |");
                System.out.println("----------------------------------------------");
            } else {
                Node temp = head;
                while (temp.next != tail) {
                    temp = temp.next; // Memindahkan temp ke node sebelum tail
                }
                temp.next = null;
                tail = temp; // Ubah tail menjadi temp
                System.out.println("----------------------------------------------");
                System.out.println("|            DATA BERHASIL DIHAPUS           |");
                System.out.println("----------------------------------------------");
            }
        } else {
            System.out.println("----------------------------------------------");
            System.out.println("|          !! LIST ANTRIAN KOSONG !!         |");
            System.out.println("----------------------------------------------");
        }
    }

    void remove(int key) {
        if (isEmpty()) { // if (!isEmpty()) {
            System.out.println("----------------------------------------------");
            System.out.println("|          !! LIST ANTRIAN KOSONG !!         |");
            System.out.println("----------------------------------------------");
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.data.nim == key && temp == head) { // if (temp.data != key && temp == head) {
                    remove(key);
                    break;
                } else if (temp.next.data.nim == key) {
                    temp.next = temp.next.next; // hapus node dengan skip
                    if (temp.next == null) { // jika node terakhir, ubah tail jadi temp
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;// pindah ke node berikutnya

            }

            System.out.println("----------------------------------------------");
            System.out.println("|            DATA BERHASIL DIHAPUS           |");
            System.out.println("----------------------------------------------");
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();// input node ke urutan pertama
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next; // memindahkan temp ke sebelum index yang dituju
            }
            temp.next = temp.next.next;
            if (temp.next == null) {// jika node terakhir, ubah tail jadi temp
                tail = temp;
            }
            System.out.println("----------------------------------------------");
            System.out.println("|            DATA BERHASIL DIHAPUS           |");
            System.out.println("----------------------------------------------");
        }
    }
}
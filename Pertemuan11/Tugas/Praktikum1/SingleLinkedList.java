package Algoritma.Pertemuan11.Tugas.Praktikum1;

public class SingleLinkedList {
    Node head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            int i=0;
            Node tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                System.out.println("Mhs"+(i+1)+", NIM: " + tmp.data.nim + ", Nama: " + tmp.data.nama);
                tmp = tmp.next;
                i++;
            }
            
        } else {
            System.out.println("Linked List Kosong");
        }
        System.out.println("");
    }

    void addFirst(Mahasiswa mhs) {
        Node ndInput = new Node(mhs, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
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
    }

    void insertAfter(int key, Mahasiswa mhs) {
        Node ndInput = new Node(mhs, null);
        Node temp = head; // note temporary
        do {
            if (temp.data.nim == key) {
                ndInput.next = temp.next; // node setelah key jadi next node baru
                temp.next = ndInput; // node baru jadi next nya key

                // if (ndInput.next != null) {
                if (ndInput.next == null) {
                    tail = ndInput; // jika key merupakan tail, ubah input jadi tail
                    break;
                }
            }
            temp = temp.next;

        } while (temp != null);// } while (temp == null); (menjalankan perulangan selama tmp tidak kosong)
        // handle key not found
        // System.out.println("Node dengan kunci " + key + " tidak ditemukan.");
    }

    void insertAt(int index, Mahasiswa mhs) {
        if (index < 0) { // if (index > 0) {
            System.out.println("Indeks tidak boleh negatif!");
            // System.out.println("Perbaiki logikanya!" + "kalau indeksnya -1
            // bagaimana???");
        } else if (index == 0) {
            addFirst(mhs); // panggil fungsi addFirst
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) { // memindahkan temp ke sebelum node yg dituju
                temp = temp.next;
            }

            temp.next = new Node(mhs, temp.next); // memasukkan node baru antara node temp dan temo.next

            if (temp.next.next == null) {
                tail = temp.next;// jika index merupakan tail, ubah input jadi tail
            }
        }
    }
    // Metode lain seperti addLast, insertAfter, insertAt harus disesuaikan juga
}


package Algoritma.Pertemuan11.Percobaan;

public class SingleLinkedList {
    Node head, tail; // declare janlup

    public boolean isEmpty() {
        return head == null; // if kosong return true && !kosong return false
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head; // node temporary
            System.out.print("Isi Linked List: \t");
            while (tmp != null) { // while (tmp == null) { (menjalankan perulangan selama tmp tidak null)
                System.out.print(tmp.data + "\t");
                tmp = tmp.next; // buat pindah temp ke node selanjutnya
            }
            System.out.println();
        } else {
            System.out.println("Linked List Kosong"); // handle jika list kosong
        }
    }

    void addFirst(int input) {
        Node ndInput = new Node(input, null); // buat node baru pake data + nextnya

        if (isEmpty()) { // jika kosong, head & tail == node baru
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head; // node baru akan ditaruh didepan head yang sudah ada
            head = ndInput; // mengubah head menjadi input baru
        }
    }

    void addLast(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) { // jika kosong, head & tail == node baru
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput; // node baru ditaruh setelah tail yg sudah ada
            tail = ndInput; // ubah tail menjadi node baru
        }
    }

    void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node temp = head; // note temporary
        do {
            if (temp.data == key) {
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

    void insertAt(int index, int input) {
        if (index < 0) { // if (index > 0) {
            System.out.println("Indeks tidak boleh negatif!");
            // System.out.println("Perbaiki logikanya!" + "kalau indeksnya -1
            // bagaimana???");
        } else if (index == 0) {
            addFirst(input); // panggil fungsi addFirst
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) { // memindahkan temp ke sebelum node yg dituju
                temp = temp.next;
            }

            temp.next = new Node(input, temp.next); // memasukkan node baru antara node temp dan temo.next

            if (temp.next.next == null) {
                tail = temp.next;// jika index merupakan tail, ubah input jadi tail
            }
        }
    }

    // Percobaan 2

    int getData(int index) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {  //for (int i = 0; i < index+1; i++) {
            tmp = tmp.next; //cari data berdasarkan index

        }
        return tmp.data; //return tmp.next.data;
    }

    int indexOf(int key) {
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) { //cari data berdasarkan key
            tmp = tmp.next;
            index++;

        }
        // jika ditemukan return index, if not return -1 (make it handle not found on main)
        if (tmp == null) { //if (tmp != null) {
            return -1; //return 1;
        } else {
            return index;
        }
    }

    void removeFirst() {
        if (isEmpty()) { // if (!isEmpty()) {
            System.out.println("Linked List Masih Kosong Tidak Dapat Dihapus!!!");
        } else if (head == tail) { //if hanya 1 data, null keun
            head = tail = null;
        } else { //skip it to the next
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) { // if (!isEmpty()) {
            System.out.println("Linked List Masih Kosong Tidak Dapat Dihapus!!!");
        } else if (head == tail) { // } else if (head != tail) {
            head = tail = null; 
        } else {
            Node temp = head;
            while (temp.next == null) { //while (temp.next != null) {
                temp = temp.next; //memindahkan temp ke tail/node terakhir
            }
            temp.next = null; 
            tail = temp; //ubah tail menjadi temp
        }
    }

    void remove(int key) {
        if (isEmpty()) { // if (!isEmpty()) {
            System.out.println("Linked List Masih Kosong Tidak Dapat Dihapus!!!");
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.data == key && temp == head) { // if (temp.data != key && temp == head) {
                    remove(key);
                    break;
                } else if (temp.next.data == key) { 
                    temp.next = temp.next.next; //hapus node dengan skip
                    if (temp.next == null) { //jika node terakhir, ubah tail jadi temp
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;//pindah ke node berikutnya

            }
        }
    }

    public void removeAt(int index){
        if (index == 0) {
            removeFirst();//input node ke urutan pertama
        } else {
            Node temp = head;
            for (int i = 0; i < index -1; i++){
                temp = temp.next; //memindahkan temp ke sebelum index yang dituju
            }
            temp.next = temp.next.next; 
            if (temp.next == null) {//jika node terakhir, ubah tail jadi temp
                tail = temp;
            }
        }
    }

}

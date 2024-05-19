package Algoritma.Pertemuan12.Praktikum.Praktikum1;

public class DoubleLinkedLists {
    Node head;
    int size;

    public DoubleLinkedLists() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Antrian item) {
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Antrian item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public int size() {
        return size;
    }

    void print() {
        System.out.println("==============================================");
        System.out.println("|            LIST ANTRIAN VAKSIN             |");
        System.out.println("----------------------------------------------");

        if (!isEmpty()) {
            int i = 0;
            Node tmp = head;
            System.out.printf("| %-8s| %-32s %s|%n", "NOMOR", "NAMA", "");
            System.out.println("----------------------------------------------");

            while (tmp != null) {
                System.out.printf("| %-8s| %-32s %s|%n", tmp.data.nomor, tmp.data.nama, "");
                tmp = tmp.next;
                i++;
            }
            System.out.println("----------------------------------------------");
            System.out.printf("|%-43s %s|%n", " Banyak Sisa Antrian   | " + size, "");

        } else {
            System.out.println("|          !! LIST ANTRIAN KOSONG !!         |");
        }

        System.out.println("==============================================");

        System.out.println("");
    }

    // PERCOBAAN 2
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            System.out.println("|          !! LIST ANTRIAN KOSONG !!         |");

        } else if (size == 1) {
            removeLast();
        } else {
            String namaHapus = head.data.nama;
            head = head.next;
            head.prev = null;
            size--;
            System.out.println("| " + namaHapus + " telah berhasil dihapus |");
        }
    }

    public void removeLast() throws Exception {
        String namaHapus;
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!!");
        } else if (head.next == null) {
            namaHapus = head.data.nama;
            head = null;
            size--;
            System.out.printf("| %-42s %s|%n", namaHapus + " telah berhasil dihapus", "");
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            namaHapus = current.data.nama;
            current.next = null;
            size--;
            System.out.println("| " + namaHapus + " telah berhasil dihapus |");
        }
    }

    Antrian get(int index) {
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
}

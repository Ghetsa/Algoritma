package Algoritma.Pertemuan12.Praktikum.Praktikum2;

import Algoritma.Pertemuan12.Praktikum.Praktikum1.Antrian;

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

    public void addFirst(Film item) {
        int cari = find(item.id);
        if (cari != -1) {
            System.out.println("----------------------------------------------");
            System.out.println("|        !! ID DATA FILM SUDAH ADA !!        |");
            System.out.println("----------------------------------------------");

        } else {
            if (isEmpty()) {
                head = new Node(null, item, null);
            } else {
                Node newNode = new Node(null, item, head);
                head.prev = newNode;
                head = newNode;
            }
            size++;
            System.out.println("----------------------------------------------");
            System.out.println("|       DATA FILM BERHASIL DITAMBAHKAN       |");
            System.out.println("----------------------------------------------");

        }

    }

    public void addLast(Film item) {
        int cari = find(item.id);
        if (cari != -1) {
            System.out.println("----------------------------------------------");
            System.out.println("|        !! ID DATA FILM SUDAH ADA !!        |");
            System.out.println("----------------------------------------------");
        } else {
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
                System.out.println("----------------------------------------------");
                System.out.println("|       DATA FILM BERHASIL DITAMBAHKAN       |");
                System.out.println("----------------------------------------------");
            }
        }

    }

    public void add(Film item, int index) throws Exception {
        int cari = find(item.id);
        if (cari != -1) {
            System.out.println("----------------------------------------------");
            System.out.println("|        !! ID DATA FILM SUDAH ADA !!        |");
            System.out.println("----------------------------------------------");
        } else {
            if (isEmpty()) {
                addFirst(item);
            } else if (index < 0 || index >= size) {
                System.out.println("----------------------------------------------");
                System.out.println("|          !! INDEX DILUAR BATAS !!          |");
                System.out.println("----------------------------------------------");

            } else {
                Node current = head;
                int i = 0;
                while (i < index) {
                    current = current.next;
                    i++;
                }
                if (current.prev == null) {
                    Node newNode = new Node(null, item, current);
                    current.prev = newNode;
                    head = newNode;
                } else {
                    Node newNode = new Node(current.prev, item, current);
                    newNode.prev = current.prev;
                    newNode.next = current;
                    current.prev.next = newNode;
                    current.prev = newNode;
                }
                size++;
                System.out.println("----------------------------------------------");
                System.out.println("|       DATA FILM BERHASIL DITAMBAHKAN       |");
                System.out.println("----------------------------------------------");
            }

        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    void print() {
        System.out.println("==============================================");
        System.out.println("|            LIST ANTRIAN VAKSIN             |");
        System.out.println("----------------------------------------------");

        if (!isEmpty()) {
            int i = 0;
            Node tmp = head;
            System.out.printf("| %-8s| %-20s| %-10s %s|%n", "ID", "JUDUL", "RATING", "");
            System.out.println("----------------------------------------------");

            while (tmp != null) {
                System.out.printf("| %-8s| %-20s| %-10s %s|%n", tmp.data.id, tmp.data.judul, tmp.data.rating, "");
                tmp = tmp.next;
                i++;
            }
            System.out.println("----------------------------------------------");
            System.out.printf("|%-43s %s|%n", " Banyak Data Film  | " + size, "");

        } else {
            System.out.println("|         !! LIST DATA FILM KOSONG !!        |");
        }

        System.out.println("==============================================");

        System.out.println("");
    }

    // PERCOBAAN 2
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            System.out.println("|         !! LIST DATA FILM KOSONG !!        |");

        } else if (size == 1) {
            removeLast();
        } else {
            String namaHapus = head.data.judul;
            head = head.next;
            head.prev = null;
            size--;
            System.out.printf("| %-42s %s|%n", "Film [" + namaHapus + "] telah berhasil dihapus", "");
        }
    }

    public void removeLast() throws Exception {
        String namaHapus;
        if (isEmpty()) {
            System.out.println("|         !! LIST DATA FILM KOSONG !!        |");
        } else if (head.next == null) {
            namaHapus = head.data.judul;
            head = null;
            size--;
            System.out.printf("| %-42s %s|%n", "Film [" + namaHapus + "] telah berhasil dihapus", "");
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            namaHapus = current.data.judul;
            current.next = null;
            size--;
            System.out.printf("| %-42s %s|%n", "Film [" + namaHapus + "] telah berhasil dihapus", "");
        }
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            try {

            } catch (Exception e) {
                // Handle it.
            }
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;

            } else {
                current.prev.next = current.next;
                current.next.prev = current.next;
            }
            size--;
        }
    }

    // PERCOBAAN 3
    Film getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        return head.data;
    }

    Film getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    Film get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public DoubleLinkedLists copy() {
        DoubleLinkedLists copyList = new DoubleLinkedLists();
        Node current = head;
        while (current != null) {
            copyList.addLast(current.data);
            current = current.next;
        }
        return copyList;
    }

    // SORTING
    void sort() {
        DoubleLinkedLists copyList = copy();
        if (copyList.isEmpty() || copyList.head.next == null) {
            return;
        }

        Node current = copyList.head.next;
        while (current != null) {
            Node next = current.next;
            Node inner = current.prev;

            while (inner != null && ((Film) inner.data).rating < ((Film) current.data).rating) {
                inner = inner.prev;
            }

            if (current.prev != inner) {
                current.prev.next = current.next;
                if (current.next != null) {
                    current.next.prev = current.prev;
                }

                if (inner == null) {
                    current.next = copyList.head;
                    copyList.head.prev = current;
                    copyList.head = current;
                    current.prev = null;
                } else {
                    current.next = inner.next;
                    inner.next.prev = current;
                    inner.next = current;
                    current.prev = inner;
                }
            }
            current = next;
        }

        copyList.print();
    }

    // FIND
    public int find(int id) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (((Film) current.data).id == id) {
                return index;
            }
            current = current.next;
            index++;
        }
        return index = -1;
    }

    // PRINT FIND
    // public void printFind(int id) {
    // Node current = head;
    // System.out.println("----------------------------------------------");
    // System.out.printf("| %-8s| %-20s| %-10s %s|%n", "ID", "JUDUL", "RATING", "");
    // System.out.println("----------------------------------------------");
    // while (current != null) {
    // if (((Film) current.data).id == id) {
    // System.out.printf("| %-8s| %-20s| %-10s %s|%n", current.data.id,
    // current.data.judul,
    // current.data.rating, "");
    // } else{

    // }
    // current = current.next;
    // }

    // }
    // public void printFind(int id) {
    //     Node current = head;
    //     boolean found = false;
    //     while (current != null) {
    //         if (((Film) current.data).id == id) {
    //             System.out.println("----------------------------------------------");
    //             System.out.printf("| %-8s| %-20s| %-10s %s|%n", "ID", "JUDUL", "RATING", "");
    //             System.out.println("----------------------------------------------");
    //             System.out.printf("| %-8s| %-20s| %-10s %s|%n", current.data.id, current.data.judul,
    //                     current.data.rating, "");
    //                     found = true;
    //         }
    //         current = current.next;
    //         index++;
    //     }
    //     System.out.println("|            DATA TIDAK DITEMUKAN            |");
    //         System.out.println("----------------------------------------------");

    // }

}

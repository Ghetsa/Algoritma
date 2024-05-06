package Algoritma.Pertemuan11.Tugas.Praktikum1;

public class Node {
    Mahasiswa data;
    Node next;

    Node(Mahasiswa mahasiswa, Node berikutnya) {
        data = mahasiswa;
        next = berikutnya;
    }

    Node() {
    }
}

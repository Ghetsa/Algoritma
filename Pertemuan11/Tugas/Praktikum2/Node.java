package Algoritma.Pertemuan11.Tugas.Praktikum2;

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

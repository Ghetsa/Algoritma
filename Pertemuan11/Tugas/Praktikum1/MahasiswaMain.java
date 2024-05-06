package Algoritma.Pertemuan11.Tugas.Praktikum1;
public class MahasiswaMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
    
        singLL.print();
        singLL.addFirst(new Mahasiswa(112, "Prita"));
        singLL.print();
    
        singLL.addLast(new Mahasiswa(115, "Sari"));
        singLL.print();
    
        singLL.addFirst(new Mahasiswa(111, "Anton"));
        singLL.print();
    
        singLL.insertAfter(112, new Mahasiswa(113, "Yusuf"));
        singLL.print();
    
        singLL.insertAt(3, new Mahasiswa(114, "Doni"));
        singLL.print();
    }
    
}
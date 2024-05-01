package Algoritma.Pertemuan10.Tugas;

public class Queue {
    Pembeli[] antrian;
    int front, rear, size, max;

    public Queue(int n) {
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.printf("|%-43s %s|%n",
                    " Antrian Terdepan  | " + antrian[front].nama + " [" + antrian[front].noHP + "]", "");

            // System.out.println("Elemen terdepan: " + antrian[front].nama + " " +
            // antrian[front].noHP);
        } else {
            System.out.println("|         !!! QUEUE MASIH KOSONG !!!         |");
        }
        System.out.println("==============================================");

    }

    public void print() {
        if (isEmpty()) {
            System.out.println("|         !!! QUEUE MASIH KOSONG !!!         |");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHP);

            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("|         QUEUE BERHASIL DIKOSONGKAN         |");
        } else {
            System.out.println("|         !!! QUEUE MASIH KOSONG !!!         |");
        }
    }

    public void enqueue(Pembeli dt) {
        if (isFull()) {
            System.out.println("----------------------------------------------");
            System.out.println("|      !!! GAGAL! QUEUE SUDAH PENUH !!!      |");
            System.out.println("----------------------------------------------");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            antrian[rear] = dt;
            size++;
            System.out.println("----------------------------------------------");
            System.out.println("|        PEMBELI BERHASIL DITAMBAHKAN        |");
            System.out.println("----------------------------------------------");

        }
    }

    public Pembeli dequeue() {
        Pembeli dt = null;
        if (isEmpty()) {
            System.out.println("----------------------------------------------");
            System.out.println("|         !!! QUEUE MASIH KOSONG !!!         |");
            System.out.println("----------------------------------------------");
        } else {
            dt = antrian[front];
            size--;
            if (front == rear) {
                front = rear = -1;
            } else {
                for (int i = front; i < rear; i++) {
                    antrian[i] = antrian[i + 1];
                }
                rear--;
            }
        }
        return dt;
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.printf("|%-43s %s|%n",
                    " Antrian Terbelakang  | " + antrian[rear].nama + " [" + antrian[rear].noHP + "]", "");

            // System.out.println("Elemen paling belakang: " + antrian[rear].nama + " " +
            // antrian[rear].noHP);
        } else {
            System.out.println("|         !!! QUEUE MASIH KOSONG !!!         |");
        }
    }

    public void peekPosition(String nama) {
        for (int i = 0; i < antrian.length; i++) {
            if (antrian[i] != null && antrian[i].nama.equals(nama)) {
                System.out.printf("|%-43s %s|%n", " Posisi [" + nama + "] dalam antrian ke- " + (i + 1), "");

                // System.out.println("Posisi pembeli " + nama + " dalam antrian: " + (i + 1));
                return;
            }
        }
        System.out.printf("|%-43s %s|%n", " !! Pembeli [" + nama + "] tidak ditemukan !!", "");
    }

    public void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("|         !!! QUEUE MASIH KOSONG !!!         |");
        } else {
            int i = front;
            System.out.printf("| %-8s| %-15s| %-15s %s|%n", "ANTRIAN", "NAMA PEMBELI", "NO. HP", "");
            System.out.println("----------------------------------------------");

            while (i != rear) {
                System.out.printf("| %-8s| %-15s| %-15s %s|%n", (i + 1), antrian[i].nama, antrian[i].noHP, "");
                i = (i + 1) % max;
            }
            System.out.printf("| %-8s| %-15s| %-15s %s|%n", (i + 1), antrian[i].nama, antrian[i].noHP, "");
            System.out.println("----------------------------------------------");

            System.out.printf("|%-43s %s|%n", " Banyak Antrian Pembeli   | " + size, "");
            System.out.println("==============================================");

        }
    }
}

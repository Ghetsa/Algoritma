package Algoritma.Pertemuan12.Praktikum.Praktikum2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in); // String
        boolean stop = true;
        String judul;
        int id;
        double rating;

        System.out.println("----------------------------------------------");
        System.out.println("|                 WELCOME TO                 |");
        System.out.println("|        PENGANTRI VAKSIN EXTRAVAGANZA       |");
        System.out.println("----------------------------------------------");

        do {
            System.out.println("==============================================");
            System.out.println("|                 MENU UTAMA                 |");
            System.out.println("----------------------------------------------");
            System.out.println("| 1. Tambah Data Awal                        |");
            System.out.println("| 2. Tambah Data Akhir                       |");
            System.out.println("| 3. Tambah Data Index Tertentu              |");
            System.out.println("| 4. Hapus Data Pertama                      |");
            System.out.println("| 5. Hapus Data Terakhir                     |");
            System.out.println("| 6. Hapus Data Tertentu                     |");
            System.out.println("| 7. Cetak Data                              |");
            System.out.println("| 8. Cari ID Film                            |");
            System.out.println("| 9. Urutkan Data Rating Film-DESC           |");
            System.out.println("| 0. Keluar                                  |");
            System.out.println("----------------------------------------------");
            System.out.print("| Pilih Menu : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("==============================================");
                    System.out.println("|           TAMBAH DATA FILM AWAL            |");
                    System.out.println("----------------------------------------------");
                    System.out.print("| Masukkan ID Film          : ");
                    id = sc.nextInt();
                    System.out.print("| Masukkan Judul Film       : ");
                    judul = scs.nextLine();
                    System.out.print("| Masukkan Rating (0,0-10,0): ");
                    rating = sc.nextDouble();
                    dll.addFirst(new Film(id, judul, rating));
                    break;
                case 2:
                    System.out.println("==============================================");
                    System.out.println("|           TAMBAH DATA FILM AKHIR           |");
                    System.out.println("----------------------------------------------");
                    System.out.print("| Masukkan ID Film          : ");
                    id = sc.nextInt();
                    System.out.print("| Masukkan Judul Film       : ");
                    judul = scs.nextLine();
                    System.out.print("| Masukkan Rating (0,0-10,0): ");
                    rating = sc.nextDouble();
                    dll.addLast(new Film(id, judul, rating));
                    break;
                case 3:
                    System.out.println("==============================================");
                    System.out.println("|       TAMBAH DATA FILM INDEX TERTENTU      |");
                    System.out.println("----------------------------------------------");
                    System.out.print("| Masukkan ID Film          : ");
                    id = sc.nextInt();
                    System.out.print("| Masukkan Judul Film       : ");
                    judul = scs.nextLine();
                    System.out.print("| Masukkan Rating (0,0-10,0): ");
                    rating = sc.nextDouble();
                    System.out.print("| Masukkan INDEX Film       : ");
                    int index = sc.nextInt();
                    dll.add(new Film(id, judul, rating), index);
                    break;
                case 4:
                    System.out.println("==============================================");
                    System.out.println("|           HAPUS DATA FILM PERTAMA          |");
                    System.out.println("----------------------------------------------");
                    dll.removeFirst();
                    System.out.println("==============================================");

                    break;
                case 5:
                    System.out.println("==============================================");
                    System.out.println("|          HAPUS DATA FILM TERAKHIR          |");
                    System.out.println("----------------------------------------------");
                    dll.removeLast();
                    System.out.println("==============================================");

                    break;
                case 6:
                    System.out.println("==============================================");
                    System.out.println("|       HAPUS DATA FILM INDEX TERTENTU       |");
                    System.out.println("----------------------------------------------");
                    System.out.print("| Masukkan INDEX Film : ");
                    int indexx = sc.nextInt();
                    dll.remove(indexx);
                    System.out.println("==============================================");

                    break;
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.println("==============================================");
                    System.out.println("|                CARI ID FILM                |");
                    System.out.println("----------------------------------------------");
                    System.out.print("| Masukkan ID Film : ");
                    int idCari = sc.nextInt();
                    
                    System.out.print("| ID Film          : "+ dll.get(dll.find(idCari)).id );
                    System.out.print("| Judul Film       : "+ dll.get(dll.find(idCari)).judul);
                    System.out.print("| Rating (0,0-10,0): "+ dll.get(dll.find(idCari)).rating);
                    System.out.println("==============================================");

                    break;
                case 9:
                    System.out.println("==============================================");
                    System.out.println("|      URUTKAN BERDASARKAN RATING - DESC     |");
                    System.out.println("----------------------------------------------");

                    dll.sort();
                    System.out.println("==============================================");

                    break;
                case 0:
                    stop = false;
                    break;

                default:
                    break;
            }

        } while (stop);

    }

}

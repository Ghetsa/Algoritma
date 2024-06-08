package Algoritma.Pertemuan15.Praktikum;

import java.util.Scanner;

public class GraphMain12 {
  public static void main(String[] args) throws Exception {
    Graph12 gedung = new Graph12(6);
    boolean stop = true;
    Scanner sc = new Scanner(System.in);

    // gedung.addEdge(0, 1, 50);
    // gedung.addEdge(0, 2, 100);
    // gedung.addEdge(1, 3, 70);
    // gedung.addEdge(2, 3, 40);
    // gedung.addEdge(3, 4, 60);
    // gedung.addEdge(4, 5, 80);

    System.out.println("----------------------------------------------");
    System.out.println("|                 WELCOME TO                 |");
    System.out.println("|                GUDANG GRAPH                |");
    System.out.println("----------------------------------------------");

    do {
      System.out.println("==============================================");
      System.out.println("|                 MENU UTAMA                 |");
      System.out.println("----------------------------------------------");
      System.out.println("| 1. Add Edge                                |");
      System.out.println("| 2. Remove Edge                             |");
      System.out.println("| 3. Degree                                  |");
      System.out.println("| 4. Print Graph                             |");
      System.out.println("| 5. Cek Edge                                |");
      System.out.println("| 0. Keluar                                  |");
      System.out.println("----------------------------------------------");
      System.out.print("| Pilih Menu : ");
      int menu = sc.nextInt();
      switch (menu) {
        case 1:
          System.out.println("==============================================");
          System.out.println("|               MENU ADD EDGE                |");
          System.out.println("----------------------------------------------");
          System.out.print("| Masukkan index asal   : ");
          int asal = sc.nextInt();
          System.out.print("| Masukkan index tujuan : ");
          int tujuan = sc.nextInt();
          System.out.print("| Masukkan jarak        : ");
          int jarak = sc.nextInt();
          System.out.println("----------------------------------------------");
          gedung.addEdge(asal, tujuan, jarak);
          System.out.println("----------------------------------------------");

          break;

        case 2:
          System.out.println("==============================================");
          System.out.println("|              MENU REMOVE EDGE              |");
          System.out.println("----------------------------------------------");
          System.out.print("| Masukkan index asal   : ");
          int asal2 = sc.nextInt();
          System.out.print("| Masukkan index tujuan : ");
          int tujuan2 = sc.nextInt();
          System.out.println("----------------------------------------------");
          gedung.removeEdge(asal2, tujuan2);
          System.out.println("----------------------------------------------");
          break;

        case 3:
          System.out.println("==============================================");
          System.out.println("|                 MENU DEGREE                |");
          System.out.println("----------------------------------------------");
          System.out.print("| Masukkan index asal   : ");
          int asal3 = sc.nextInt();
          System.out.println("----------------------------------------------");
          gedung.degree(asal3);
          System.out.println("----------------------------------------------");
          break;

        case 4:
          System.out.println("==============================================");
          System.out.println("|             MENU PRINT GRAPH               |");
          System.out.println("----------------------------------------------");
          gedung.printGraph();
          break;

        case 5:
          System.out.println("==============================================");
          System.out.println("|               MENU CEK EDGE                |");
          System.out.println("----------------------------------------------");
          System.out.print("| Masukkan edge asal   : ");
          int asal4 = sc.nextInt();
          System.out.print("| Masukkan edge tujuan : ");
          int tujuan4 = sc.nextInt();
          System.out.println("----------------------------------------------");
          if (gedung.isPathExist(asal4, tujuan4)) {
            System.out.printf("| %-42s %s|%n", "Node " + asal4 + " dan Node " + tujuan4 + " bertetangga", "");

          } else {
            System.out.printf("| %-42s %s|%n", "Node " + asal4 + " dan Node " + tujuan4 + " tidak bertetangga", "");
          }
          System.out.println("==============================================");

          System.out.println("");
          break;

        case 0:

          System.out.println("==============================================");
          System.out.println("|         !!! KELUAR DARI PROGRAM !!!        |");
          System.out.println("==============================================");
          break;

        default:
          break;
      }
    } while (stop);
  }
}

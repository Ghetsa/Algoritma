package Algoritma.Pertemuan15.Praktikum;

public class Graph12 {
  int vertex;
  DoubleLinkedList12 list[];

  public Graph12(int v) {
    vertex = v;
    list = new DoubleLinkedList12[v];
    for (int i = 0; i < v; i++) {
      list[i] = new DoubleLinkedList12();
    }
  }

  public void addEdge(int asal, int tujuan, int jarak) {
    if (asal >= 0) {
      list[asal].addFirst(tujuan, jarak); // jika directed graph
      // list[tujuan].addFirst(asal, jarak); // Jika undirected graph
    } else {
      System.out.println("|       !!!  INDEX DILUAR BATAS  !!!         |");
    }
  }

  public void degree(int asal) throws Exception {
    int k, totalIn = 0, totalOut = 0;
    for (int i = 0; i < vertex; i++) {
      // inDegree
      for (int j = 0; j < list[i].size(); j++) {
        if (list[i].get(j) == asal) {
          ++totalIn;
        }
      }
      // outDegree
      for (k = 0; k < list[asal].size(); k++) {
        list[asal].get(k);
      }
      totalOut = k;
    }
    System.out.printf("|%-33s |%-8s %s|%n", " InDegree dari Gedung " + (char) ('A' + asal), totalIn, "");
    System.out.printf("|%-33s |%-8s %s|%n", " OutDegree dari Gedung " + (char) ('A' + asal), totalOut, "");
    System.out.printf("|%-33s |%-8s %s|%n", " Degree dari Gedung " + (char) ('A' + asal), (totalIn + totalOut), "");
    // jika directed graph
    // System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ":" +
    // list[asal].size());

  }

  public void removeEdge(int asal, int tujuan) throws Exception {
    for (int i = 0; i < vertex; i++) {
      if (i == tujuan) {
        list[asal].remove(tujuan);
      }
    }
    System.out.println("|           EDGE BERHASIL DIHAPUS            |");

  }

  public void removeAllEdges() {
    for (int i = 0; i < vertex; i++) {
      list[i].clear();
    }
    System.out.println("Graf berhasil dikosongkan");
  }

  public void printGraph() throws Exception {
    for (int i = 0; i < vertex; i++) {
      if (list[i].size() > 0) {
        System.out.printf("|%-43s %s|%n", " Gedung " + (char) ('A' + i) + " terhubung dengan :", "");
        System.out.print("| ");
        // System.out.print("| Gedung " + (char) ('A' + i) + " terhubung dengan :");
        for (int j = 0; j < list[i].size(); j++) {
          System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + "m), ");
        }
        System.out.println("");
        System.out.println("----------------------------------------------");
      }
    }
    System.out.println("");
  }

  // method untuk mengecek edge graph
  public boolean isEdge(int asal, int tujuan) throws Exception {
    boolean edge = false;
    for (int i = 0; i < list[asal].size(); i++) {
      if (asal > -1) {
        if (list[asal].get(i) == tujuan) {
          edge = true;
        }
      }
    }
    return edge;
  }

  // method print edge
  public void printEdges() throws Exception {
    System.out.println("| Daftar Semua Edge:                         |");
    for (int i = 0; i < vertex; i++) {
      for (int j = 0; j < list[i].size(); j++) {
        int tujuan = list[i].get(j);
        int jarak = list[i].getJarak(j);
        System.out.printf("| %-42s %s|%n", (char) ('A' + i) + " -> " + (char) ('A' + tujuan) + " (" + jarak + "m)", "");
        // System.out.println("| "+(char) ('A' + i) + " -> " + (char) ('A' + tujuan) + "
        // (" + jarak + "m)");
      }
    }
    System.out.println("==============================================");

  }

  public boolean isPathExist(int start, int end) {
    boolean[] visited = new boolean[vertex];
    return dfs(start, end, visited);
  }

  private boolean dfs(int current, int end, boolean[] visited) {
    if (current == end) {
      return true;
    }
    visited[current] = true;
    Node12 temp = list[current].head;
    while (temp != null) {
      if (!visited[temp.data] && dfs(temp.data, end, visited)) {
        return true;
      }
      temp = temp.next;
    }
    return false;
  }

}

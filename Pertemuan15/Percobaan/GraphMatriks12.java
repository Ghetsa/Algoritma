package Algoritma.Pertemuan15.Percobaan;

public class GraphMatriks12 {
  int vertex;
  int[][] matriks;

  public GraphMatriks12(int v) {
    vertex = v;
    matriks = new int[v][v];
  }

  public void makeEdge(int asal, int tujuan, int jarak) {
    matriks[asal][tujuan] = jarak;
  }

  public void removeEdge(int asal, int tujuan) {
    matriks[asal][tujuan] = 0;
  }

  public void printGraph() {
    for (int i = 0; i < vertex; i++) {
      System.out.print("Gedung " + (char) ('A' + i) + ": ");
      for (int j = 0; j < vertex; j++) {
        if (matriks[i][j] != -1) {
          System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + "m), ");
        }
      }
      System.out.println();
    }
  }

  public int inDegree(int node) {
    int inDegree = 0;
    for (int i = 0; i < vertex; i++) {
      if (matriks[i][node] != 0) {
        inDegree++;
      }
    }
    return inDegree;
  }

  public int outDegree(int node) {
    int outDegree = 0;
    for (int i = 0; i < vertex; i++) {
      if (matriks[node][i] != 0) {
        outDegree++;
      }
    }
    return outDegree;
  }

  public void degree(int node) {
    int in = inDegree(node);
    int out = outDegree(node);
    System.out.printf("| %-30s | %-6s %s|%n", "InDegree dari Gedung " + (char) ('A' + node) , in, "");
    System.out.printf("| %-30s | %-6s %s|%n", "OutDegree dari Gedung " + (char) ('A' + node) , out, "");
    System.out.printf("| %-30s | %-6s %s|%n", "Total Degree dari Gedung " + (char) ('A' + node), (in + out), "");
    
    System.out.println("-------------------------------------------");
  }
}

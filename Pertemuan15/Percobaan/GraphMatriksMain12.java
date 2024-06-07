package Algoritma.Pertemuan15.Percobaan;

public class GraphMatriksMain12 {
  public static void main(String[] args) {
    GraphMatriks12 gdg = new GraphMatriks12(4);
    gdg.makeEdge(0, 1, 50);
    gdg.makeEdge(1, 0, 60);
    gdg.makeEdge(1, 2, 70);
    gdg.makeEdge(2, 1, 80);
    gdg.makeEdge(2, 3, 40);
    gdg.makeEdge(3, 0, 90);
    gdg.printGraph();
    System.out.println("Hasil setelah penghapusan edge");
    gdg.removeEdge(2, 1);
    gdg.printGraph();
  }
}

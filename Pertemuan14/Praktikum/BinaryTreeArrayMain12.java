package Algoritma.Pertemuan14.Praktikum;


public class BinaryTreeArrayMain12 {
  public static void main(String[] args) {
    BinaryTreeArray12 bta = new BinaryTreeArray12();
    bta.add(10);
    bta.add(20);
    bta.add(30);
    bta.add(40);
    bta.add(50);
    bta.add(60);
    bta.add(70);

    System.out.println("InOrder traversal:");
    bta.traverseInOrder(bta.root);

    System.out.println("\nPreOrder traversal:");
    bta.traversePreOrder(bta.root);

    System.out.println("\nPostOrder traversal:");
    bta.traversePostOrder(bta.root);
  }
}

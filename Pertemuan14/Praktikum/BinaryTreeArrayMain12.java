package Algoritma.Pertemuan14.Praktikum;

import javax.sound.midi.Soundbank;

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
    System.out.println("=============================================");
    System.out.println("|             BINARY TREE ARRAY             |");
    System.out.println("---------------------------------------------");
    System.out.print("| InOrder traversal: ");
    bta.traverseInOrder(bta.root);
    System.out.println("  |");

    System.out.print("| InOrder traversal: ");
    bta.traverseInOrder(bta.root);
    System.out.println("  |");

    System.out.print("| PreOrder traversal:");
    bta.traversePreOrder(bta.root);
    System.out.println("  |");

    System.out.print("| PostOrder traversal:");
    bta.traversePostOrder(bta.root);
    System.out.println(" |");

    System.out.println("=============================================");
  }
}

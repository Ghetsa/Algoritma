package Algoritma.Pertemuan14.Praktikum;

public class BinaryTreeMain12 {
  public static void main(String[] args) {
    BinaryTree12 bt = new BinaryTree12();
    // bt.add(6);
    // bt.add(4);
    // bt.add(8);
    // bt.add(3);
    // bt.add(5);
    // bt.add(7);
    // bt.add(9);
    // bt.add(10);
    // bt.add(15);
    bt.addRec(6);
    bt.addRec(4);
    bt.addRec(8);
    bt.addRec(3);
    bt.addRec(5);
    bt.addRec(7);
    bt.addRec(9);
    bt.addRec(10);
    bt.addRec(15);

    
    System.out.println("===============================================");
    System.out.println("|                 BINARY TREE                 |");
    System.out.println("-----------------------------------------------");
    System.out.print("| PreOrder Traversal : ");
    bt.traversePreOrder(bt.root);
    System.out.println("   |");
    System.out.print("| InOrder Traversal : ");
    bt.traverseInOrder(bt.root);
    System.out.println("    |");
    System.out.print("| PostOrder Traversal : ");
    bt.traversePostOrder(bt.root);
    System.out.println("  |");
    System.out.printf("| %-43s %s|%n", "Find Node : " + bt.find(5), "");
    System.out.println("-----------------------------------------------");
    System.out.printf("| %-43s %s|%n", "Delete Node 8", "");
    bt.delete(8);
    System.out.print("| PreOrder Traversal : ");
    bt.traversePreOrder(bt.root);
    System.out.println("     |");
    System.out.println("-----------------------------------------------");
    System.out.printf("| %-43s %s|%n", "Nilai Minimum: " + bt.findMin(), "");
    System.out.printf("| %-43s %s|%n", "Nilai Maximum: " + bt.findMax(), "");

    System.out.println("-----------------------------------------------");

    System.out.print("| Node Leaf: ");
    bt.printLeaf(bt.root);
    System.out.println("                        |");

    System.out.printf("| %-43s %s|%n", "Jumlah Node Leaf: " + bt.countLeaf(bt.root), "");

    System.out.println("===============================================");

  }
}

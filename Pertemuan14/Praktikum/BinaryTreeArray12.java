package Algoritma.Pertemuan14.Praktikum;

public class BinaryTreeArray12 {
  int[] data;
  Node12 root;
  int idxLast;

  public BinaryTreeArray12() {
    data = new int[10];
  }

  boolean isEmpty() {
    return root == null;
  }

  void add(int data) {
    if (isEmpty()) {
      root = new Node12(data);
    } else {
      Node12 current = root;
      while (true) {
        if (data > current.data) {
          if (current.right == null) {
            current.right = new Node12(data);
            break;
          } else {
            current = current.right;
          }
        } else if (data < current.data) {
          if (current.left == null) {
            current.left = new Node12(data);
            break;
          } else {
            current = current.left;
          }
        } else { // Data udah ada
          break;
        }
      }
    }
  }

  void populateData(int data[], int idxLast) {
    this.data = data;
    this.idxLast = idxLast;
  }

  void traverseInOrder(Node12 node) {
    if (node != null) {
      traverseInOrder(node.left);
      System.out.print(node.data + " ");
      traverseInOrder(node.right);
    }
  }

  void traversePreOrder(Node12 node) {
    if (node != null) {
      System.out.print(" " + node.data);
      traversePreOrder(node.left);
      traversePreOrder(node.right);
    }
  }

  void traversePostOrder(Node12 node) {
    if (node != null) {
      traversePostOrder(node.left);
      traversePostOrder(node.right);
      System.out.print(" " + node.data);
    }
  }
}

package Algoritma.Pertemuan15.Percobaan;

public class Node {
  int data, jarak;
  Node prev,next;

  Node(Node prev, int data, int jarak, Node next){
    this.prev = prev;
    this.data = data;
    this.jarak = jarak;
    this.next = next;
  }
}

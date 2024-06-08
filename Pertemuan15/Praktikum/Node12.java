package Algoritma.Pertemuan15.Praktikum;

public class Node12 {
  int data, jarak;
  Node12 prev,next;

  Node12(Node12 prev, int data, int jarak, Node12 next){
    this.prev = prev;
    this.data = data;
    this.jarak = jarak;
    this.next = next;
  }
}

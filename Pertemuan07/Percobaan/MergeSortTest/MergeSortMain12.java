package Algoritma.Pertemuan07.Percobaan.MergeSortTest;

public class MergeSortMain12 {
    public static void main(String[] args) {
        int data[] = { 10, 40, 30, 50, 70, 20, 100, 90 };
        System.out.println("-----------------------------");
        System.out.println("| Sorting dengan Merge Sort |");
        MergeSorting12 mSort = new MergeSorting12();
        System.out.println("-----------------------------");
        System.out.println("|          Data Awal        |");
        System.out.println("-----------------------------");
        System.out.print("|  ");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("-----------------------------");
        System.out.println("|      Setelah Diurutkan    |");
        System.out.println("-----------------------------");
        System.out.print("|  ");
        mSort.printArray(data);
        System.out.println("-----------------------------");
    }
}

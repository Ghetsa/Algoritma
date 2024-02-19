package Algoritma.Pertemuan01;

import java.util.Scanner;

public class Praktikum02_Perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        long nim;
        int nilai = 0;

        if (input.hasNextLong()) {
            nim = input.nextLong();
            long digit = nim % 100;
            String padding = String.format("%02d", digit);
            int last2Digit = Integer.parseInt(padding);

            if (last2Digit < 10) {
                nilai = last2Digit + 10;
            }
            System.out.println("n: " + nilai);

            for (int i = 1; i <= nilai; i++) {
                if (i % 2 == 1) {
                    System.out.print("* ");
                } else if (i == 6 || i == 10) {
                    System.out.print("* ");
                } else {
                    System.out.print(i + " ");
                }

            }
        }
    }
}

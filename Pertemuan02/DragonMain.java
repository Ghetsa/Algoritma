package Algoritma.Pertemuan02;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class DragonMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai awal X : ");
        int x = input.nextInt();
        System.out.print("Masukkan nilai awal Y : ");
        int y = input.nextInt();
        System.out.print("Masukkan LEBAR        : ");
        int width = input.nextInt();
        System.out.print("Masukkan TINGGI       : ");
        int height = input.nextInt();

        Dragon koor = new Dragon();
        koor.x = x;
        koor.y = y;
        koor.width = width;
        koor.height = height;

        System.out.println("---------------------------------");
        while (x > 0 || y > 0 || x < width || y < height) {
            System.out.print("Masukkan Perintah(L/R/U/D): ");
            char perintah = input.next().charAt(0);

            switch (perintah) {
                case 'L':
                    koor.moveLeft();
                    break;
                case 'R':
                    koor.moveRight();
                    break;
                case 'U':
                    koor.moveUp();
                    break;
                case 'D':
                    koor.moveDown();
                    break;
                default:
                    break;
            }

            koor.printPosition();
        }
    }
}

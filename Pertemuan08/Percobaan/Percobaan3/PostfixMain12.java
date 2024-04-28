package Algoritma.Pertemuan08.Percobaan.Percobaan3;

import java.util.Scanner;
public class PostfixMain12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.println("======================================================");
        System.out.print("| Masukkan ekspresi matematika (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        int total = Q.length();
        Postfix12 post = new Postfix12(total);
        P = post.konversi(Q);
        System.out.println("------------------------------------------------------");
        System.out.printf("|%-50s %s|%n", "Postfix: " + P, "");
        System.out.print("======================================================");

    }
}

import java.util.Scanner;

public class Praktikum01 {

    public static void main(String[] args) {
        float IP;
        String huruf;
        String status;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Nilai Tugas    : ");
        float tugas = input.nextInt();
        validasi(tugas);

        System.out.print("Masukkan Nilai Kuis     : ");
        float kuis = input.nextInt();
        validasi(kuis);

        System.out.print("Masukkan Nilai UTS      : ");
        float uts = input.nextInt();
        validasi(uts);

        System.out.print("Masukkan Nilai UAS      : ");
        float uas = input.nextInt();
        validasi(uas);

        IP = nilaiAkhir(tugas, kuis, uts, uas);
        huruf = nilaiHuruf(IP);
        status = IP < 65 ? "TIDAK LULUS" : "LULUS";

        System.out.println("=================================================================================");
        System.out.printf("| %-10s\t| %-15s| %-20s |%n", "NAMA", "NILAI AKHIR", "NILAI HURUF", "STATUS");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("| %-20s| %-10.2f\t| %-15s| %-20s |%n", nama, IP, huruf, status);
        System.out.println("=================================================================================");

    }

    static void validasi(float nilai) {
        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai yang anda masukkan tidak VALID");
            System.exit(0);
        }

    }

    static float nilaiAkhir(float tugas, float kuis, float uts, float uas) {
        float nilai = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        return nilai;
    }

    static String nilaiHuruf(float nilai) {
        String nilaiHuruf;

        if (nilai > 80 && nilai <= 100) {
            nilaiHuruf = "A";
        } else if (nilai > 73 && nilai <= 80) {
            nilaiHuruf = "B+";
        } else if (nilai > 65 && nilai <= 73) {
            nilaiHuruf = "B";
        } else if (nilai > 60 && nilai <= 65) {
            nilaiHuruf = "C+";
        } else if (nilai > 50 && nilai <= 60) {
            nilaiHuruf = "C";
        } else if (nilai > 39 && nilai <= 50) {
            nilaiHuruf = "D";
        } else if (nilai >= 0 && nilai <= 39) {
            nilaiHuruf = "E";
        } else {
            nilaiHuruf = "tidak valid";
        }

        return nilaiHuruf;

    }

}
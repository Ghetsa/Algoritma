package Algoritma.Pertemuan05.BruteForceDivideConquer.Latihan;

public class praktikum01 {
    private static int MaxTopACC(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r) / 2;
        int lMax = MaxTopACC(arr, l, mid);
        int rMax = MaxTopACC(arr, mid + 1, r);

        return Math.max(lMax, rMax);
    }

    private static int MinTopACC(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r) / 2;
        int lMin = MinTopACC(arr, l, mid);
        int rMin = MinTopACC(arr, mid + 1, r);

        return Math.min(lMin, rMin);
    }

    private static double AveTopPower(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        double average = (double) total / arr.length;
        return average;
    }

    static int FindIntegerInArray(int[] cari, int cariapabang) {
        int hasil = 0;
        for (int i = 0; i < cari.length; i++) {
            if (cari[i] != 0 && cari[i] == cariapabang) {
                hasil = i;
                break;
            } else {
                hasil = -1;
            }
        }
        return hasil;
    }

    public static void main(String[] args) {
        String[] merk = { "BMW", "Ford", "Nissan", "Subaru", "Subaru", "Toyota", "Toyota", "Volkswagen" };
        String[] tipe = { "M2 Coupe", "Fiesta ST", "370Z", "BRZ", "Impreza WRX STI", "AE86 Trueno", "86/GT86",
                "Golf GTI" };
        int[] tahun = { 2016, 2014, 2009, 2014, 2013, 1986, 2014, 2014 };
        int[] top_acc = { 6816, 3921, 4360, 4058, 6255, 3700, 4180, 4180 };
        int[] top_power = { 728, 575, 657, 609, 703, 553, 609, 631 };

        int maxAcc = MaxTopACC(top_acc, 0, top_acc.length - 1);
        int minAcc = MinTopACC(top_acc, 0, top_acc.length - 1);
        int iMax = FindIntegerInArray(top_acc, maxAcc);
        int iMin = FindIntegerInArray(top_acc, minAcc);
        double avePower = AveTopPower(top_power);

        System.out.println("+++++++ TOP ACC TERTINGGI +++++++");
        System.out.println("Merk     : " + merk[iMax]);
        System.out.println("Tipe     : " + tipe[iMax]);
        System.out.println("Tahun    : " + tahun[iMax]);
        System.out.println("Top power: " + top_power[iMax]);
        System.out.println("Top acceleration tertinggi: " + maxAcc);
        System.out.println("=================================");
        System.out.println("------- TOP ACC TERENDAH -------");
        System.out.println("Merk     : " + merk[iMin]);
        System.out.println("Tipe     : " + tipe[iMin]);
        System.out.println("Tahun    : " + tahun[iMin]);
        System.out.println("Top power: " + top_power[iMin]);
        System.out.println("Top acceleration terendah: " + minAcc);
        System.out.println("=================================");
        System.out.println("------ RATA-RATA TOP POWER ------");
        System.out.println("Rerata top power: " + avePower);
        System.out.println("=================================");
    }

}

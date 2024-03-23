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

    static int FindIntegerInArray(int[] found, int foundWhat) {
        int hasil = 0;
        for (int i = 0; i < found.length; i++) {
            if (found[i] != 0 && found[i] == foundWhat) {
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

        int maxAcc = MaxTopACC(top_acc, 0, top_acc.length - 1);
        int minAcc = MinTopACC(top_acc, 0, top_acc.length - 1);
        int iMax = FindIntegerInArray(top_acc, maxAcc);
        int iMin = FindIntegerInArray(top_acc, minAcc);

        System.out.println("++++ TOP ACC TERTINGGI ++++");
        System.out.println("Merk: " + merk[iMax]);
        System.out.println("Tipe: " + merk[iMax]);
        System.out.println("Tahun: " + merk[iMax]);
        System.out.println("Top acceleration tertinggi: " + maxAcc);

        System.out.println("Top acceleration terendah: " + minAcc);
    }

}

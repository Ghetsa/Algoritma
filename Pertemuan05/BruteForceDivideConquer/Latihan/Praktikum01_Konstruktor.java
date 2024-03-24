package Algoritma.Pertemuan05.BruteForceDivideConquer.Latihan;

public class Praktikum01_Konstruktor {
    String merk;
    String tipe;
    int tahun;
    int top_acc;
    int top_power;

    Praktikum01_Konstruktor(String merk, String tipe, int tahun, int top_acc, int top_power) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acc = top_acc;
        this.top_power = top_power;
    }

    private static int MaxTopACC(Praktikum01_Konstruktor[] arr, int l, int r) {
        if (l == r) {
            return arr[l].top_acc;
        }

        int mid = (l + r) / 2;
        int lMax = MaxTopACC(arr, l, mid);
        int rMax = MaxTopACC(arr, mid + 1, r);

        return Math.max(lMax, rMax);
    }

    private static int MinTopACC(Praktikum01_Konstruktor[] arr, int l, int r) {
        if (l == r) {
            return arr[l].top_acc;
        }

        int mid = (l + r) / 2;
        int lMin = MinTopACC(arr, l, mid);
        int rMin = MinTopACC(arr, mid + 1, r);

        return Math.min(lMin, rMin);
    }

    private static double AveTopPower(Praktikum01_Konstruktor[] arr) {
        int total = 0;
        for (Praktikum01_Konstruktor car : arr) {
            total += car.top_power;
        }
        double average = (double) total / arr.length;
        return average;
    }

    static int FindIntegerInArray(Praktikum01_Konstruktor[] arr, int cariapabang) {
        int hasil = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].top_acc != 0 && arr[i].top_acc == cariapabang) {
                hasil = i;
                break;
            } else {
                hasil = -1;
            }
        }
        return hasil;
    }

    public static void main(String[] args) {
        Praktikum01_Konstruktor[] cars = {
                new Praktikum01_Konstruktor("BMW", "M2 Coupe", 2016, 6816, 728),
                new Praktikum01_Konstruktor("Ford", "Fiesta ST", 2014, 3921, 575),
                new Praktikum01_Konstruktor("Nissan", "370Z", 2009, 4360, 657),
                new Praktikum01_Konstruktor("Subaru", "BRZ", 2014, 4058, 609),
                new Praktikum01_Konstruktor("Subaru", "Impreza WRX STI", 2013, 6255, 703),
                new Praktikum01_Konstruktor("Toyota", "AE86 Trueno", 1986, 3700, 553),
                new Praktikum01_Konstruktor("Toyota", "86/GT86", 2014, 4180, 609),
                new Praktikum01_Konstruktor("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };

        int maxAcc = MaxTopACC(cars, 0, cars.length - 1);
        int minAcc = MinTopACC(cars, 0, cars.length - 1);
        int iMax = FindIntegerInArray(cars, maxAcc);
        int iMin = FindIntegerInArray(cars, minAcc);
        double avePower = AveTopPower(cars);

        System.out.println("=================================");
        System.out.println("+++++++ TOP ACC TERTINGGI +++++++");
        System.out.println("Merk     : " + cars[iMax].merk);
        System.out.println("Tipe     : " + cars[iMax].tipe);
        System.out.println("Tahun    : " + cars[iMax].tahun);
        System.out.println("Top power: " + cars[iMax].top_power);
        System.out.println("Top acceleration tertinggi: " + maxAcc);
        System.out.println("=================================");
        System.out.println("------- TOP ACC TERENDAH -------");
        System.out.println("Merk     : " + cars[iMin].merk);
        System.out.println("Tipe     : " + cars[iMin].tipe);
        System.out.println("Tahun    : " + cars[iMin].tahun);
        System.out.println("Top power: " + cars[iMin].top_power);
        System.out.println("Top acceleration terendah: " + minAcc);
        System.out.println("=================================");
        System.out.println("...... RATA-RATA TOP POWER ......");
        System.out.println("Rerata top power: " + avePower);
        System.out.println("=================================");
    }
}

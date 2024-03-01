package Algoritma.Pertemuan03;

public class Segitiga {
    public int alas;
    public int tinggi;
    public double SMiring;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public double hitungLuas() {
        return (alas * tinggi) / 2;
    }

    public double hitungSMiring() {
        SMiring = Math.sqrt((Math.pow(alas, 2)) + (Math.pow(tinggi, 2)));
        return SMiring;
    }

    public double hitungKeliling() {
        return alas + tinggi + SMiring;
    }

    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[4];

        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);

        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Segitiga ke-" + i + ", Luas permukaan: " + sgArray[i].hitungLuas() + ", Keliling: "
                    + sgArray[i].hitungKeliling());
        }

    }
}

package Algoritma.Pertemuan03;

public class Praktikum1_LimasPersegi {
    public static class Limas {
        public int sisi;
        public int tinggi;
        public double sisiMiring;

        public Limas() {
        }

        double hitungSMiring() {
            sisiMiring = Math.sqrt(((sisi / 2) * (sisi / 2)) + (tinggi * tinggi));
            return sisiMiring;
        }

        public double hitungVolume() {
            double volume = ((sisi * sisi * tinggi) / 3);
            return volume;
        }

        public double hitungLPermukaan() {
            hitungSMiring();
            double LP = ((4 * ((sisi * sisiMiring) / 2)) + (sisi * sisi));
            return LP;
        }

    }

}

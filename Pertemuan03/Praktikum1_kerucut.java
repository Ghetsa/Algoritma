package Algoritma.Pertemuan03;

public class Praktikum1_kerucut {

    public static class Kerucut {
        public int jari;
        public int selimut;
        public double tinggi;

        public Kerucut() {
        }

        double hitungTinggi() {
            tinggi = Math.sqrt((selimut * selimut) - (jari * jari));
            return tinggi;
        }

        public double hitungVolume() {
            hitungTinggi();
            double volume = ((Math.PI * jari * jari * tinggi) / 3);
            return volume;
        }

        public double hitungLPermukaan() {
            double LP = (Math.PI * jari * selimut) + (Math.PI * jari * jari);
            return LP;
        }

    }

}
package Algoritma.Pertemuan03;

public class Praktikum1_Bola {
    public static class Bola {
        public int jari;
        public float phi = 3.14F;

        public Bola(int j, int p) {
            jari = j;
            phi = p;
        }

        public Bola() {
        }

        public float hitungVolume() {
            float volume = (4 * phi * jari * jari);
            return volume;
        }

        public float hitungLPermukaan() {
            float LP = (4 * (phi * jari * jari * jari) / 3);
            return LP;
        }

    }

}

package Algoritma.Pertemuan03;

public class ArrayObjects {

    public static class PersegiPanjang {
        public int panjang;
        public int lebar;
    }

    public static void main(String[] args) {
        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        ppArray[0] = new PersegiPanjang();
        ppArray[0].panjang = 110;
        ppArray[0].lebar = 300;

        ppArray[1] = new PersegiPanjang();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40;

        ppArray[2] = new PersegiPanjang();
        ppArray[2].panjang = 110;
        ppArray[2].lebar = 300;

        System.out.println("Persegi Panjang ke-0, panjang; " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
        System.out.println("Persegi Panjang ke-0, panjang; " + ppArray[1].panjang + ", lebar: " + ppArray[1].lebar);
        System.out.println("Persegi Panjang ke-0, panjang; " + ppArray[2].panjang + ", lebar: " + ppArray[2].lebar);
    }

}

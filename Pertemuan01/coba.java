package Algoritma.Pertemuan01;

public class coba {
    public static void main(String[] args) {
        // Array 2D untuk menyimpan rating film dari 3 penonton untuk 4 film
        int[][] ratings = {
                { 4, 5, 3, 2 }, // Rating penonton 1 untuk 4 film
                { 3, 4, 4, 3 }, // Rating penonton 2 untuk 4 film
                { 5, 4, 4, 5 } // Rating penonton 3 untuk 4 film
        };

        // Memanggil method untuk mencari rata-rata rating
        double[] averageRatings = findAverageRatings(ratings);

        // Menampilkan hasil rata-rata rating untuk setiap film
        for (int i = 0; i < averageRatings.length; i++) {
            System.out.printf("Rata-rata rating untuk film %d: %.2f\n", i + 1, averageRatings[i]);
        }
    }

    // Method untuk mencari rata-rata rating untuk setiap film
    public static double[] findAverageRatings(int[][] ratings) {
        int numFilms = ratings[0].length;
        int numViewers = ratings.length;
        double[] averageRatings = new double[numFilms];

        for (int filmIndex = 0; filmIndex < numFilms; filmIndex++) {
            int totalRating = 0;
            for (int viewerIndex = 0; viewerIndex < numViewers; viewerIndex++) {
                totalRating += ratings[viewerIndex][filmIndex];
            }
            averageRatings[filmIndex] = (double) totalRating / numViewers;
        }

        // for (int i = 0; i < averageRatings.length; i++) {
        // System.out.println("Rata-rata rating untuk film %d: %.2f\n" + (i + 1)
        // averageRatings[i]);
        // }

        return averageRatings;
    }
}

package Algoritma.KUIS2.CODES;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    LinkedList LL = new LinkedList();
    RaceResult[] raceResults = new RaceResult[22];
    // Deklarasi pembalap
    Driver[] drivers = {
        new Driver("Lewis Hamilton"), // Mercedes
        new Driver("George Russell"), // Mercedes
        new Driver("Max Verstappen"), // Red Bull
        new Driver("Sergio Perez"), // Red Bull
        new Driver("Charles Leclerc"), // Ferrari
        new Driver("Carlos Sainz"), // Ferrari
        new Driver("Lando Norris"), // McLaren
        new Driver("Oscar Piastri"), // McLaren
        new Driver("Esteban Ocon"), // Alpine
        new Driver("Pierre Gasly"), // Alpine
        new Driver("Yuki Tsunoda"), // AlphaTauri
        new Driver("Nyck de Vries"), // AlphaTauri
        new Driver("Fernando Alonso"), // Aston Martin
        new Driver("Lance Stroll"), // Aston Martin
        new Driver("Valtteri Bottas"), // Alfa Romeo
        new Driver("Zhou Guanyu"), // Alfa Romeo
        new Driver("Alex Albon"), // Williams
        new Driver("Logan Sargeant"), // Williams
        new Driver("Kevin Magnussen"), // Haas
        new Driver("Nico Hulkenberg") // Haas
    };

    for (Driver driver : drivers) {
      LL.addDriver(driver);
    }

    int[][] racePositions = {
        // Bahrain Grand Prix 1
        { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 },
        // Saudi Arabia Grand Prix 2
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0 },
        // Australia Grand Prix 3
        { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1 },
        // Azerbaijan Grand Prix 4
        { 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2 },
        // Miami Grand Prix 5
        { 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2, 3 },
        // Monaco Grand Prix 6
        { 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2, 3, 4 },
        // Spain Grand Prix 7
        { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 },
        // Canada Grand Prix 8
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0 },
        // Austria Grand Prix 9
        { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1 },
        // great Britain Grand Prix 10
        { 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2 },
        // Hungary Grand Prix 11
        { 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2, 3 },
        // Belgium Grand Prix 12
        { 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2, 3, 4 },
        // Netherland Grand Prix 13
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0 },
        // Ilaty Grand Prix 14
        { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1 },
        // Japan Grand Prix 15
        { 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2 },
        // Qatar Grand Prix 16
        { 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2, 3, 4 },
        // US Grand Prix 17
        { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 },
        // Mexico Grand Prix 18
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0 },
        // Brazil Grand Prix 19
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0 },
        // LV Grand Prix 20
        { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1 },
        // Abu Dhabi Grand Prix 21
        { 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2, 3 },
        // Singapore Grand Prix 22
        { 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2 },
    };

    for (int i = 0; i < racePositions.length; i++) {
      raceResults[i] = new RaceResult(LinkedList.getRaceName(i + 1), racePositions[i], "");
      LinkedList.distributePoints(LL, drivers, raceResults[i]);
    }
    String[] fastestLapDrivers = {
        "Lewis Hamilton", // Bahrain Grand Prix 1
        "Max Verstappen", // Saudi Arabia Grand Prix 2
        "Charles Leclerc", // Australia Grand Prix 3
        "Sergio Perez", // Azerbaijan Grand Prix 4
        "George Russell", // Miami Grand Prix 5
        "Carlos Sainz", // Monaco Grand Prix 6
        "Lando Norris", // Spain Grand Prix 7
        "Oscar Piastri", // Canada Grand Prix 8
        "Esteban Ocon", // Austria Grand Prix 9
        "Pierre Gasly", // Great Britain Grand Prix 10
        "Yuki Tsunoda", // Hungary Grand Prix 11
        "Fernando Alonso", // Belgium Grand Prix 12
        "Lance Stroll", // Netherlands Grand Prix 13
        "Valtteri Bottas", // Italy Grand Prix 14
        "Zhou Guanyu", // Japan Grand Prix 15
        "Alex Albon", // Qatar Grand Prix 16
        "Logan Sargeant", // United States Grand Prix 17
        "Kevin Magnussen", // Mexico Grand Prix 18
        "Nico Hulkenberg", // Brazil Grand Prix 19
        "Lewis Hamilton", // Las Vegas Grand Prix 20
        "Max Verstappen", // Abu Dhabi Grand Prix 21
        "Max Verstappen" // Singapore Grand Prix 21
    };

    for (int i = 0; i < racePositions.length; i++) {
      raceResults[i] = new RaceResult(LinkedList.getRaceName(i + 1), racePositions[i], fastestLapDrivers[i]);
      LinkedList.distributePoints(LL, drivers, raceResults[i]);
    }
    Scanner scanner = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    boolean stop = true;

    System.out.println("----------------------------------------------");
    System.out.println("|         SELAMAT DATANG DI F1 2023          |");
    System.out.println("----------------------------------------------");

    do {
      System.out.println("==============================================");
      System.out.println("|                 MENU UTAMA                 |");
      System.out.println("----------------------------------------------");
      System.out.println("| 1. Hasil Tiap Races                        |");
      System.out.println("| 2. Hasil Akhir                             |");
      System.out.println("| 3. Pemenang 10 Besar                       |");
      System.out.println("| 4. Ketentuan Pemberian Poin                |");
      System.out.println("| 0. Keluar                                  |");
      System.out.println("----------------------------------------------");
      System.out.print("| Pilih Menu : ");
      int menu = sc.nextInt();
      switch (menu) {
        case 1:
          System.out.println("==============================================");
          System.out.println("|     HASIL TIAP RACES - POSISI PEMBALAP     |");
          System.out.println("----------------------------------------------");
          System.out.println("| 1. Bahrain Grand Prix                      |");
          System.out.println("| 2. Saudi Arabia Grand Prix                 |");
          System.out.println("| 3. Australia Grand Prix                    |");
          System.out.println("| 4. Azerbaijan Grand Prix                   |");
          System.out.println("| 5. Miami Grand Prix                        |");
          System.out.println("| 6. Monaco Grand Prix                       |");
          System.out.println("| 7. Spain Grand Prix                        |");
          System.out.println("| 8. Canada Grand Prix                       |");
          System.out.println("| 9. Austria Grand Prix                      |");
          System.out.println("| 10. Great Britain Grand Prix               |");
          System.out.println("| 11. Hungary Grand Prix                     |");
          System.out.println("| 12. Belgium Grand Prix                     |");
          System.out.println("| 13. Netherlands Grand Prix                 |");
          System.out.println("| 14. Italy Grand Prix                       |");
          System.out.println("| 15. Japan Grand Prix                       |");
          System.out.println("| 16. Qatar Grand Prix                       |");
          System.out.println("| 17. United States Grand Prix               |");
          System.out.println("| 18. Mexico Grand Prix                      |");
          System.out.println("| 19. Brazil Grand Prix                      |");
          System.out.println("| 20. Las Vegas Grand Prix                   |");
          System.out.println("| 21. Abu Dhabi Grand Prix                   |");
          System.out.println("| 22. Singapore Grand Prix                   |");
          System.out.println("----------------------------------------------");

          System.out.print("| Pilih Grand Prix (1-22): ");
          int grandPrixChoice = sc.nextInt();

          String grandPrixName = LinkedList.getRaceName(grandPrixChoice);
          if (!grandPrixName.equals("Unknown Grand Prix")) {
            LL.printRaceResults(scanner, raceResults, grandPrixName, drivers);
          } else {
            System.out.println("Grand Prix tidak valid.");
          }
          break;
        case 2:
          LL.printLeaderboard();
          break;
        case 3:
          LL.printTop10();
          break;
        case 4:
          System.out.println("==============================================");
          System.out.println("|       KETENTUAN PEMBERIAN POIN BALAPAN     |");
          System.out.println("----------------------------------------------");
          System.out.printf("| %-20s | %-19s |\n", "Posisi Finish", "Poin");
          System.out.println("----------------------------------------------");
          System.out.printf("| %-20s | %-19s |\n", "Posisi 1 (Podium)", 25);
          System.out.printf("| %-20s | %-19s |\n", "Posisi 2 (Podium)", 18);
          System.out.printf("| %-20s | %-19s |\n", "Posisi 3 (Podium)", 15);
          System.out.printf("| %-20s | %-19s |\n", "Posisi 4", 12);
          System.out.printf("| %-20s | %-19s |\n", "Posisi 5", 10);
          System.out.printf("| %-20s | %-19s |\n", "Posisi 6", 8);
          System.out.printf("| %-20s | %-19s |\n", "Posisi 7", 6);
          System.out.printf("| %-20s | %-19s |\n", "Posisi 8", 4);
          System.out.printf("| %-20s | %-19s |\n", "Posisi 9", 2);
          System.out.printf("| %-20s | %-19s |\n", "Posisi 10", 1);
          System.out.printf("| %-20s | %-19s |\n", "Posisi 11 ke atas", "0 poin");
          System.out.println("----------------------------------------------");
          System.out.printf("| %-12s | %-26s |\n", "Lap Tercepat", "1 poin (jika finis 10 besar)");
          System.out.println("==============================================");
          break;
        case 0:
        System.out.println("==============================================");
        System.out.println("|             KELUAR DARI PROGRAM            |");
        System.out.println("==============================================");

          stop = false;
          break;

        default:
          break;
      }
    } while (stop);

    scanner.close();
  }

}
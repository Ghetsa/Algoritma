package Algoritma.KUIS2.CODES;

public class RaceResult {
  private String raceName;
  private int[] positions;
  private String fastestLapDriver;

  public RaceResult(String raceName, int[] positions, String fastestLapDriver) {
    this.raceName = raceName;
    this.positions = positions;
    this.fastestLapDriver = fastestLapDriver;
  }

  public RaceResult() {
  }

  public String getRaceName() {
    return raceName;
  }

  public int[] getPositions() {
    return positions;
  }

  public String getFastestLapDriver() {
    return fastestLapDriver;
  }

  public void printResults(Driver[] drivers) {
    System.out.println("==============================================");
    System.out.println("|     HASIL TIAP RACES - POSISI PEMBALAP     |");
    System.out.println("----------------------------------------------");
    System.out.printf("| %-42s %s|%n", "    Hasil [" + raceName + "]  ", "");
    System.out.println("----------------------------------------------");
    System.out.printf("| %-7s | %-32s |\n", "Posisi", "Nama Pembalap");
    System.out.println("==============================================");

    for (int i = 0; i < positions.length; i++) {
      if (positions[i] != -1 && positions[i] < drivers.length) {
        String driverName = drivers[positions[i]].getName();
        System.out.printf("| %-7s | %-32s |\n", (i + 1), driverName);
      }
    }
    System.out.println("----------------------------------------------");
    System.out.printf("| %-42s %s|%n", "Driver Lap Tercepat [" + fastestLapDriver + "] ", "");
    System.out.println("==============================================");

  }

}
